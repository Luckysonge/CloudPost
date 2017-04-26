package com.cloudPost.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudPost.dto.LetterDetail;
import com.cloudPost.dto.LetterKeyword;
import com.cloudPost.entity.Letter;
import com.cloudPost.entity.Notify;
import com.cloudPost.service.LetterService;
import com.cloudPost.service.NotifyService;

/**
 * �ż�������
 * @author ����
 * @vertion 4.26
 */
@Controller
@RequestMapping("/letter")
public class LetterController {
	
	@Autowired
	private LetterService letterService;
	
	@Autowired
	private NotifyService notifyService;


	//���ѷ���
	//����userID��ѯ��letter������ѯ�������saveTime������ƫ��offsetλ��������ƪ�����ơ�isPublic���ֶ�Ϊtrue��
	//select * from letter where userID = {userID} and isPublic = 1 limit {offset},{pagenum}
	@ResponseBody
	@RequestMapping(value="/{userID}/{offset}", method=RequestMethod.GET)
	public List<Letter> find(@PathVariable("userID")String userID, 
			@PathVariable("offset")int offset) {
		return letterService.find(userID, offset, 5);
	}

	
	//���͹����ʼ�
	//��title��userID��content��saveTime��isPublic��1����sended��1���½���¼���롰letter����
	@ResponseBody
	@RequestMapping(value="/{userID}/{title}", method=RequestMethod.POST)
	public boolean publish(@PathVariable("userID")String userID, 
			@PathVariable("title")String title,
			@RequestParam(value="content", required=true)String content) {
		Letter letter = new Letter();
		letter.setTitle(title);
		letter.setUserid(userID);
		letter.setContent(content);
		letter.setIspublic(1);
		letter.setSended(1);
		letter.setSavetime(new Date());
		boolean flag = letterService.saveLetter(letter);
		return flag;
	}
	
	
	//˽���ʼ�
	//��title��userID��content��saveTime��isPublic��0����sended��1���½���¼����letter��
	//��userID	time	isComment	source	readed	letterID
	//sendID	saveTime	false	userID	false	letterID ����notify��
	@ResponseBody
	@RequestMapping(value="/{title}/{userID}/delivery/{sendID}", method=RequestMethod.POST)
	public boolean send(@PathVariable("userID")String userID, 
			@PathVariable("title")String title,
			@PathVariable("sendID")String sendID,
			@RequestParam(value="content", required=true)String content) {
		Letter letter = new Letter();
		letter.setTitle(title);
		letter.setUserid(userID);
		letter.setContent(content);
		letter.setIspublic(0);
		letter.setSended(1);
		letter.setSavetime(new Date());
		boolean flag = false;
		boolean flag1 = letterService.saveLetter(letter);
		int letterID = letterService.getMaxLetterID();
		Notify notify = new Notify();
		notify.setUserid(sendID);
		notify.setTime(new Date());
		notify.setIscomment(0);
		notify.setSource(userID);
		notify.setReaded(0);
		notify.setLetterid(letterID);
		boolean flag2 = notifyService.saveNotify(notify);
		if(flag1==true && flag2==true){
			flag = true;
		}
		return flag;
	}

	
	//�ҵ�����
	//����userID�顰letter����ȡ��title��content��saveTime��sended��letterID������sended is true
	//����letterID�顰letter_keywords����ȡ��keywords
	@ResponseBody
	@RequestMapping(value="/list/sent/{userID}", method=RequestMethod.GET)
	public List<LetterKeyword> getSentList(@PathVariable("userID")String userID) {
		List<LetterKeyword> letterKeyword = letterService.getLetterList(userID, 1);
		return letterKeyword;
	}

	
	//�ҵĲݸ�
	//����userID�顰letter����ȡ��title��content��saveTime��sended��letterID������sended is false
	//����letterID�顰letter_keywords����ȡ��keywords
	@ResponseBody
	@RequestMapping(value="/list/unsent/{userID}", method=RequestMethod.GET)
	public List<LetterKeyword> getUnsentList(@PathVariable("userID")String userID) {
		List<LetterKeyword> letterKeyword = letterService.getLetterList(userID, 0);
		return letterKeyword;
	}

	
	//ɾ�����£��ݸ�
	@ResponseBody
	@RequestMapping(value="/{userID}/{letterID}", method=RequestMethod.DELETE)
	public boolean deleteLetter(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.deleteLetter(userID, letterID);
		return flag;
	}

	
	//�鿴������ϸ����
	@ResponseBody
	@RequestMapping(value="/{letterID}", method=RequestMethod.GET)
	public LetterDetail getLetterDetail(@PathVariable("letterID")int letterID) {
		LetterDetail letterDetail = letterService.getLetterDetail(letterID);
		return letterDetail;
	}

	
	//������
	//����userID�顰recent_letters����ȡ��letterID��
	//�ٸ���letterID�顰letter������ȡtitle��author��content
	@ResponseBody
	@RequestMapping(value="/{userID}/recentview", method=RequestMethod.GET)
	public List<Letter> getRecentView(@PathVariable("userID")String userID) {
		List<Letter> letterList = letterService.getRecentView(userID);
		return letterList;
	}
	
	
	//�ҵ��ղ�
	//����userID�顰love_letters����ȡ��letterID��
	//�ٸ���letterID�顰letter������ȡ*��title��author��content��
	@ResponseBody
	@RequestMapping(value="/{userID}/collection", method=RequestMethod.GET)
	public List<Letter> getCollectionList(@PathVariable("userID")String userID) {
		return letterService.getCollectionList(userID);
	}
	
	
	//����ղ�
	//����userID��letterID�ڡ�love_letters��������һ����¼
	@ResponseBody
	@RequestMapping(value="/{userID}/collection/{letterID}", method=RequestMethod.POST)
	public boolean saveCollection(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.saveCollection(userID, letterID);
		return flag;
	}
	
	
	//ȡ���ղ�
	//����userID��letterID�ڡ�love_letters����ɾ��һ����¼
	@ResponseBody
	@RequestMapping(value="/{userID}/collection/{letterID}", method=RequestMethod.DELETE)
	public boolean deleteCollection(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.deleteCollection(userID, letterID);
		return flag;
	}
	
}
