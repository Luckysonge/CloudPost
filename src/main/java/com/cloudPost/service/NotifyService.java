package com.cloudPost.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudPost.entity.Notify;


/**
 * ֪ͨҵ���
 * @author ��
 * @version 3.1
 */
public interface NotifyService {
	
	/**
	 * ��ȡ�û�������֪ͨ
	 * @param UserID
	 * @return
	 */
	List<Notify> getNotifyList(String userID);
	
	
	/**
	 * ����Ϣ��Ϊ�Ѷ�
	 * @param notifyID
	 * @return
	 */
	boolean updateNotify(int notifyID);
	
	
	/**
	 * ��������
	 * @param userID
	 * @param letterID
	 * @param comment
	 * @param time
	 * @return
	 */
	boolean saveNotify(String userID, int letterID, String comment, Date time);
	
	
	/**
	 * ��������
	 * @param notify
	 * @return
	 */
	boolean saveNotify(Notify notify);
}
