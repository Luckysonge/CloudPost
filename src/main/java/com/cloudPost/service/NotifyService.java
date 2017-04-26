package com.cloudPost.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudPost.entity.Notify;


/**
 * 通知业务层
 * @author 旭栋
 * @version 3.1
 */
public interface NotifyService {
	
	/**
	 * 获取用户的所有通知
	 * @param UserID
	 * @return
	 */
	List<Notify> getNotifyList(String userID);
	
	
	/**
	 * 将消息改为已读
	 * @param notifyID
	 * @return
	 */
	boolean updateNotify(int notifyID);
	
	
	/**
	 * 保存评论
	 * @param userID
	 * @param letterID
	 * @param comment
	 * @param time
	 * @return
	 */
	boolean saveNotify(String userID, int letterID, String comment, Date time);
	
	
	/**
	 * 保存评论
	 * @param notify
	 * @return
	 */
	boolean saveNotify(Notify notify);
}
