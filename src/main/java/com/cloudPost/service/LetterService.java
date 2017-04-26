package com.cloudPost.service;

import java.util.List;

import com.cloudPost.dto.LetterDetail;
import com.cloudPost.dto.LetterKeyword;
import com.cloudPost.entity.Letter;


/**
 * 信件业务类
 * @author 旭栋
 * @version 3.9
 */
public interface LetterService {
	
	
	/**
	 * 保存邮件
	 * @param userID
	 * @param title
	 * @param content
	 * @return
	 */
	boolean saveLetter(Letter letter);

	
	/**
	 * 保存收藏
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean saveCollection(String userID, int letterID);

	
	/**
	 * 删除信件
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean deleteLetter(String userID, int letterID);
	
	
	/**
	 * 删除收藏
	 * @param userID
	 * @param letterID
	 * @return
	 */
	boolean deleteCollection(String userID, int letterID);
	
	
	/**
	 * 查询文章
	 * @param letterID
	 * @return
	 */
	Letter getLetter(int letterID);

	
	/**
	 * 查询文章详情
	 * @param letterID
	 * @return
	 */
	LetterDetail getLetterDetail(int letterID);
	
	
	/**
	 * 查询热门信件列表
	 * @param userID
	 * @param offset
	 * @return
	 */
	List<Letter> find(String userID, int offset, int pagenum);
	
	
	/**
	 * 查询信件列表
	 * @param userID
	 * @param sended
	 * @return
	 */
	List<LetterKeyword> getLetterList(String userID, int sended);
	
	
	/**
	 * 查询最近浏览的信件ID列表
	 * @param userID
	 * @return
	 */
	List<Letter> getRecentView(String userID);
	
	
	/**
	 * 查询收藏的信件ID列表
	 * @param userID
	 * @return
	 */
	List<Letter> getCollectionList(String userID);
	
	
	/**
	 * 查询当前最大的letterID
	 * @return
	 */
	int getMaxLetterID();
	
}
