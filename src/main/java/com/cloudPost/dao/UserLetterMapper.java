package com.cloudPost.dao;

import com.cloudPost.entity.UserLetter;

public interface UserLetterMapper {
    int deleteByPrimaryKey(Integer letterid);

    int insert(UserLetter record);

    int insertSelective(UserLetter record);

    UserLetter selectByPrimaryKey(Integer letterid);

    int updateByPrimaryKeySelective(UserLetter record);

    int updateByPrimaryKey(UserLetter record);
}