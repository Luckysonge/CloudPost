package com.cloudPost.dao;

import com.cloudPost.entity.UserKeywords;

public interface UserKeywordsMapper {
    int insert(UserKeywords record);

    int insertSelective(UserKeywords record);
}