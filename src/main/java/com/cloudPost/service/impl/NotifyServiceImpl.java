package com.cloudPost.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudPost.dao.LetterCommentMapper;
import com.cloudPost.dao.LetterMapper;
import com.cloudPost.dao.NotifyMapper;
import com.cloudPost.entity.LetterComment;
import com.cloudPost.entity.Notify;
import com.cloudPost.service.NotifyService;

@Service("notifyService")
public class NotifyServiceImpl implements NotifyService {

	@Autowired
	private NotifyMapper notifyMapper;
	
	@Autowired
	private LetterCommentMapper letterCommentMapper;
	
	@Autowired
	private LetterMapper letterMapper;
	
	
	public List<Notify> getNotifyList(String userID) {
		return notifyMapper.selectByUserid(userID);
	}
	
	public boolean updateNotify(int notifyID) {
		Notify notify = new Notify();
		notify.setNotifyid(notifyID);
		notify.setReaded(1);
		int result = notifyMapper.updateByPrimaryKeySelective(notify);
		boolean flag = false;
		if(result == 1){
			flag = true;
		}
		return flag;
	}

	public boolean saveNotify(String userID, int letterID, String comment,
			Date time) {
		LetterComment letterComment = new LetterComment();
		letterComment.setComment(comment);
		letterComment.setLetterid(letterID);
		letterComment.setTime(time);
		letterComment.setUserid(userID);
		int result = letterCommentMapper.insert(letterComment);
		if(result == 0){
			return false;
		}
		String sendID = letterMapper.selectByPrimaryKey(letterID).getUserid();
		Notify notify = new Notify();
		notify.setIscomment(1);
		notify.setLetterid(letterID);
		notify.setReaded(0);
		notify.setSource(userID);
		notify.setTime(time);
		notify.setUserid(sendID);
		result = notifyMapper.insertSelective(notify);
		if(result == 0){
			return false;
		}
		return true;
	}

	public boolean saveNotify(Notify notify) {
		int result = notifyMapper.insertSelective(notify);
		if(result == 0){
			return false;
		}
		return true;
	}
}
