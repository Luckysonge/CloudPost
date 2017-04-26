package com.cloudPost.service;

import java.util.List;

import com.cloudPost.dto.LetterDetail;
import com.cloudPost.dto.LetterKeyword;
import com.cloudPost.entity.Letter;


/**
 * �ż�ҵ����
 * @author ��
 * @version 3.9
 */
public interface LetterService {
	
	
	/**
	 * �����ʼ�
	 * @param userID
	 * @param title
	 * @param content
	 * @return
	 */
	boolean saveLetter(Letter letter);

	
	/**
	 * �����ղ�
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean saveCollection(String userID, int letterID);

	
	/**
	 * ɾ���ż�
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean deleteLetter(String userID, int letterID);
	
	
	/**
	 * ɾ���ղ�
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean deleteCollection(String userID, int letterID);
	
	
	/**
	 * ��ѯ����
	 * @param letterID
	 * @return
	 */
	Letter getLetter(int letterID);

	
	/**
	 * ��ѯ��������
	 * @param letterID
	 * @return
	 */
	LetterDetail getLetterDetail(int letterID);
	
	
	/**
	 * ��ѯ�����ż��б�
	 * @param userID
	 * @param offset
	 * @return
	 */
	List<Letter> find(String userID, int offset, int pagenum);
	
	
	/**
	 * ��ѯ�ż��б�
	 * @param userID
	 * @param sended
	 * @return
	 */
	List<LetterKeyword> getLetterList(String userID, int sended);
	
	
	/**
	 * ��ѯ���������ż�ID�б�
	 * @param userID
	 * @return
	 */
	List<Letter> getRecentView(String userID);
	
	
	/**
	 * ��ѯ�ղص��ż�ID�б�
	 * @param userID
	 * @return
	 */
	List<Letter> getCollectionList(String userID);
	
	
	/**
	 * ��ѯ��ǰ����letterID
	 * @return
	 */
	int getMaxLetterID();
	
}
