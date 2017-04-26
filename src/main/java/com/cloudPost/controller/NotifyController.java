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
 * 通知控制类
 * @author 旭栋
 * @version 4.26
 */
@RestController
@RequestMapping("/notify")
public class NotifyController {

	@Autowired
	private NotifyService notifyService;


	//我的通知
	//根据userID查“notify”表取得*（isComment、source、time、readed、letterID、notityID）
	@ResponseBody
	@RequestMapping(value="/{userID}/list", method=RequestMethod.GET)
	public List<Notify> getNotifyList(@PathVariable("userID") String userID){
		return notifyService.getNotifyList(userID);
	}


	//读取通知
	//根据“letterID”跳转查看文章主页面
	//(当isComment is true时“notify”表的letterID字段存储的是回复的文章ID，否则letterID为私信的ID)
	//根据notityID修改“notify”表的“readed”属性为true
	@ResponseBody
	@RequestMapping(value="/{notifyID}/read", method=RequestMethod.PUT)
	public boolean readNotify(@PathVariable("notifyID") int notifyID){
		return notifyService.updateNotify(notifyID);
	}


	//发表评论
	//将userID、letterID、comment、time新建记录存入"letter_comment"表
	//根据letterID查询“letter”表获得“userID”作为sendID
	//根据letterID在“notify”表新增条目 :
	//	userID	time	isComment	source	readed	letterID
	//	sendID	saveTime	true	userID	false	letterID
	@ResponseBody
	@RequestMapping(value="/{userID}/{letterID}/notification", method=RequestMethod.POST)
	public boolean sendNotify(@PathVariable("userID") String userID, @PathVariable("letterID")int letterID, 
						@RequestParam(value="comment", required=true) String comment){
		return notifyService.saveNotify(userID, letterID, comment, new Date());
	}

}
