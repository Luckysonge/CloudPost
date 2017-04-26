package com.cloudPost.dao;

import java.util.List;

import com.cloudPost.entity.LetterComment;

public interface LetterCommentMapper {
    int insert(LetterComment record);

    int insertSelective(LetterComment record);
    
    List<String> selectByLetterID(Integer letterID);
}