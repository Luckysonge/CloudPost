package com.cloudPost.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudPost.dao.LetterCommentMapper;
import com.cloudPost.dao.LetterKeywordsMapper;
import com.cloudPost.dao.LetterMapper;
import com.cloudPost.dao.LoveLettersMapper;
import com.cloudPost.dao.RecentLettersMapper;
import com.cloudPost.dto.LetterDetail;
import com.cloudPost.dto.LetterKeyword;
import com.cloudPost.entity.Letter;
import com.cloudPost.entity.LoveLetters;
import com.cloudPost.service.LetterService;

@Service("letterService")
public class LetterServiceImpl implements LetterService {

	@Autowired
	private LetterMapper letterMapper;
	
	@Autowired
	private LetterKeywordsMapper letterKeywordsMapper;
	
	@Autowired
	private LetterCommentMapper letterCommentMapper;
	
	@Autowired
	private RecentLettersMapper recentLettersMapper;
	
	@Autowired
	private LoveLettersMapper loveLettersMapper;
	
	
	public boolean saveLetter(Letter letter) {
		int result = letterMapper.insertSelective(letter);
		boolean flag = false;
		if(result == 1){
			flag = true;
		}
		return flag;
	}

	public boolean saveCollection(String userID, int letterID) {
		LoveLetters loveLetters = new LoveLetters();
		loveLetters.setLetterid(letterID);
		loveLetters.setUserid(userID);
		int result =  loveLettersMapper.insert(loveLetters);
		boolean flag = false;
		if(result == 1){
			flag = true;
		}
		return flag;
	}

	public boolean deleteLetter(String userID, int letterID) {
		int result = letterMapper.deleteByPrimaryKey(letterID);
		boolean flag = false;
		if(result == 1){
			flag = true;
		}
		return flag;
	}

	public boolean deleteCollection(String userID, int letterID) {
		int result = loveLettersMapper.delete(userID, letterID);
		boolean flag = false;
		if(result == 1){
			flag = true;
		}
		return flag;
	}

	public Letter getLetter(int letterID) {
		return letterMapper.selectByPrimaryKey(letterID);
	}

	public LetterDetail getLetterDetail(int letterID) {
		Letter letter = letterMapper.selectByPrimaryKey(letterID);
		List<String> keywordList = letterKeywordsMapper.selectKeywords(letterID);
		List<String> commentList = letterCommentMapper.selectByLetterID(letterID);
		LetterDetail letterDetail = new LetterDetail();
		letterDetail.setComment(commentList);
		letterDetail.setContent(letter.getContent());
		letterDetail.setKeywords(keywordList);
		letterDetail.setReadTime(letter.getReadtime());
		letterDetail.setTitle(letter.getTitle());
		letterDetail.setUserID(letter.getUserid());
		return letterDetail;
	}

	public List<Letter> find(String userID, int offset, int pagenum) {
		return letterMapper.selectLimit(userID, offset, pagenum);
	}

	public List<LetterKeyword> getLetterList(String userID, int sended) {
		List<Letter> letterList = letterMapper.selectByUserID(userID, sended);
		List<LetterKeyword> letterKeywordList = new LinkedList<LetterKeyword>();
		for(Letter letter: letterList){
			LetterKeyword letterKeyword = new LetterKeyword();
			List<String> keywordList = letterKeywordsMapper.selectKeywords(letter.getLetterid());
			letterKeyword.setContent(letter.getContent());
			letterKeyword.setKeywords(keywordList);
			letterKeyword.setLetterID(letter.getLetterid());
			letterKeyword.setSaveTime(letter.getSavetime());
			letterKeyword.setSended(sended);
			letterKeyword.setTitle(letter.getTitle());
			letterKeywordList.add(letterKeyword);
		}
		return letterKeywordList;
	}

	public List<Letter> getRecentView(String userID) {
		List<Integer> letteridList = recentLettersMapper.selectByUserID(userID);
		List<Letter> letterList = new LinkedList<Letter>();
		for(Integer letterid:letteridList){
			Letter letter = this.getLetter(letterid);
			letterList.add(letter);
		}
		return letterList;
	}

	public List<Letter> getCollectionList(String userID) {
		List<Integer> letteridList = loveLettersMapper.selectByUserID(userID);
		List<Letter> letterList = new LinkedList<Letter>();
		for(Integer letterid:letteridList){
			Letter letter = this.getLetter(letterid);
			letterList.add(letter);
		}
		return letterList;
	}

	public int getMaxLetterID() {
		return letterMapper.selectMaxLetterID();
	}

	public List<String> getKeywords(Integer letterID) {
		return letterKeywordsMapper.selectKeywords(letterID);
	}

}
