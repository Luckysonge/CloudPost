package com.cloudPost.dto;

import java.util.Date;
import java.util.List;

public class LetterKeyword {
	private String title;
	
	private String content;
	
	private Date saveTime;
	
	private int sended;
	
	private int letterID;
	
	private List<String> keywords;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSaveTime() {
		return saveTime;
	}

	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}

	public int getSended() {
		return sended;
	}

	public void setSended(int sended) {
		this.sended = sended;
	}

	public int getLetterID() {
		return letterID;
	}

	public void setLetterID(int letterID) {
		this.letterID = letterID;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	
}
