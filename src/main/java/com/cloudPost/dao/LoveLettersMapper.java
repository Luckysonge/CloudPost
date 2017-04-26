package com.cloudPost.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cloudPost.entity.LoveLetters;

public interface LoveLettersMapper {
    int delete(@Param("userid")String userid, @Param("letterid")Integer letterid);
    
    int insert(LoveLetters record);

    int insertSelective(LoveLetters record);
    
    List<Integer> selectByUserID(String userid);
}