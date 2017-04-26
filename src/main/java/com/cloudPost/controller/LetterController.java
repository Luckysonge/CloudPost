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
 * 信件控制类
 * @author 朱旭栋
 * @vertion 4.26
 */
@Controller
@RequestMapping("/letter")
public class LetterController {
	
	@Autowired
	private LetterService letterService;
	
	@Autowired
	private NotifyService notifyService;


	//好友发现
	//根据userID查询“letter”表，查询结果按“saveTime”降序，偏移offset位，限制五篇，限制“isPublic”字段为true。
	//select * from letter where userID = {userID} and isPublic = 1 limit {offset},{pagenum}
	@ResponseBody
	@RequestMapping(value="/{userID}/{offset}", method=RequestMethod.GET)
	public List<Letter> find(@PathVariable("userID")String userID, 
			@PathVariable("offset")int offset) {
		return letterService.find(userID, offset, 5);
	}

	
	//发送公开邮件
	//将title、userID、content、saveTime、isPublic（1）、sended（1）新建记录存入“letter”表
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
	
	
	//私发邮件
	//将title、userID、content、saveTime、isPublic（0）、sended（1）新建记录存入letter表
	//将userID	time	isComment	source	readed	letterID
	//sendID	saveTime	false	userID	false	letterID 存入notify表
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

	
	//我的文章
	//根据userID查“letter”表取得title、content、saveTime、sended、letterID，限制sended is true
	//根据letterID查“letter_keywords”表取得keywords
	@ResponseBody
	@RequestMapping(value="/list/sent/{userID}", method=RequestMethod.GET)
	public List<LetterKeyword> getSentList(@PathVariable("userID")String userID) {
		List<LetterKeyword> letterKeyword = letterService.getLetterList(userID, 1);
		return letterKeyword;
	}

	
	//我的草稿
	//根据userID查“letter”表取得title、content、saveTime、sended、letterID，限制sended is false
	//根据letterID查“letter_keywords”表取得keywords
	@ResponseBody
	@RequestMapping(value="/list/unsent/{userID}", method=RequestMethod.GET)
	public List<LetterKeyword> getUnsentList(@PathVariable("userID")String userID) {
		List<LetterKeyword> letterKeyword = letterService.getLetterList(userID, 0);
		return letterKeyword;
	}

	
	//删除文章／草稿
	@ResponseBody
	@RequestMapping(value="/{userID}/{letterID}", method=RequestMethod.DELETE)
	public boolean deleteLetter(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.deleteLetter(userID, letterID);
		return flag;
	}

	
	//查看文章详细内容
	@ResponseBody
	@RequestMapping(value="/{letterID}", method=RequestMethod.GET)
	public LetterDetail getLetterDetail(@PathVariable("letterID")int letterID) {
		LetterDetail letterDetail = letterService.getLetterDetail(letterID);
		return letterDetail;
	}

	
	//最近浏览
	//根据userID查“recent_letters”表取得letterID；
	//再根据letterID查“letter”表，获取title、author、content
	@ResponseBody
	@RequestMapping(value="/{userID}/recentview", method=RequestMethod.GET)
	public List<Letter> getRecentView(@PathVariable("userID")String userID) {
		List<Letter> letterList = letterService.getRecentView(userID);
		return letterList;
	}
	
	
	//我的收藏
	//根据userID查“love_letters”表取得letterID；
	//再根据letterID查“letter”表，获取*（title、author、content）
	@ResponseBody
	@RequestMapping(value="/{userID}/collection", method=RequestMethod.GET)
	public List<Letter> getCollectionList(@PathVariable("userID")String userID) {
		return letterService.getCollectionList(userID);
	}
	
	
	//添加收藏
	//根据userID、letterID在“love_letters”表新增一条记录
	@ResponseBody
	@RequestMapping(value="/{userID}/collection/{letterID}", method=RequestMethod.POST)
	public boolean saveCollection(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.saveCollection(userID, letterID);
		return flag;
	}
	
	
	//取消收藏
	//根据userID、letterID在“love_letters”表删除一条记录
	@ResponseBody
	@RequestMapping(value="/{userID}/collection/{letterID}", method=RequestMethod.DELETE)
	public boolean deleteCollection(@PathVariable("userID")String userID,
			@PathVariable("letterID")int letterID) {
		boolean flag = letterService.deleteCollection(userID, letterID);
		return flag;
	}
	
}
