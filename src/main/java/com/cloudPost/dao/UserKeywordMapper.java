package com.cloudPost.dao;

import com.cloudPost.entity.UserKeyword;

public interface UserKeywordMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserKeyword record);

    int insertSelective(UserKeyword record);

    UserKeyword selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserKeyword record);

    int updateByPrimaryKey(UserKeyword record);
}