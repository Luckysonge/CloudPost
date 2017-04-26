package com.cloudPost.service;

import com.cloudPost.entity.User;


/**
 * �û�ҵ����
 * @author ��
 * @version 2.18
 */
public interface UserService {
	
	
	/**
	 * ��¼
	 * @param user
	 * @return
	 */
	boolean login(User user);
	
	
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	boolean register(User user);
	
	
	/**
	 * ��ѯ�û�
	 * @param name
	 * @return
	 */
	User queryByName(String name);
}
