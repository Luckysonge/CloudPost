package com.cloudPost.dao;

import java.util.List;

import com.cloudPost.entity.RecentLetters;

public interface RecentLettersMapper {
    int insert(RecentLetters record);

    int insertSelective(RecentLetters record);
    
    List<Integer> selectByUserID(String userID);
}