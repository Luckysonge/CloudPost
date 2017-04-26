package com.cloudPost.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudPost.entity.Notify;
import com.cloudPost.service.NotifyService;

/**
 * ֪ͨ������
 * @author ��
 * @version 4.26
 */
@RestController
@RequestMapping("/notify")
public class NotifyController {

	@Autowired
	private NotifyService notifyService;


	//�ҵ�֪ͨ
	//����userID�顰notify����ȡ��*��isComment��source��time��readed��letterID��notityID��
	@ResponseBody
	@RequestMapping(value="/{userID}/list", method=RequestMethod.GET)
	public List<Notify> getNotifyList(@PathVariable("userID") String userID){
		return notifyService.getNotifyList(userID);
	}


	//��ȡ֪ͨ
	//���ݡ�letterID����ת�鿴������ҳ��
	//(��isComment is trueʱ��notify�����letterID�ֶδ洢���ǻظ�������ID������letterIDΪ˽�ŵ�ID)
	//����notityID�޸ġ�notify����ġ�readed������Ϊtrue
	@ResponseBody
	@RequestMapping(value="/{notifyID}/read", method=RequestMethod.PUT)
	public boolean readNotify(@PathVariable("notifyID") int notifyID){
		return notifyService.updateNotify(notifyID);
	}


	//��������
	//��userID��letterID��comment��time�½���¼����"letter_comment"��
	//����letterID��ѯ��letter�����á�userID����ΪsendID
	//����letterID�ڡ�notify����������Ŀ :
	//	userID	time	isComment	source	readed	letterID
	//	sendID	saveTime	true	userID	false	letterID
	@ResponseBody
	@RequestMapping(value="/{userID}/{letterID}/notification", method=RequestMethod.POST)
	public boolean sendNotify(@PathVariable("userID") String userID, @PathVariable("letterID")int letterID, 
						@RequestParam(value="comment", required=true) String comment){
		return notifyService.saveNotify(userID, letterID, comment, new Date());
	}

}
