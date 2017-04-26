package com.cloudPost.dao;

import java.util.List;

import com.cloudPost.entity.LetterKeywords;

public interface LetterKeywordsMapper {
    int insert(LetterKeywords record);

    int insertSelective(LetterKeywords record);
    
    List<String> selectKeywords(Integer letterID);
}