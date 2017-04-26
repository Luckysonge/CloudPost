package com.cloudPost.dao;

import com.cloudPost.entity.Keyword;

public interface KeywordMapper {
    int deleteByPrimaryKey(Integer keyid);

    int insert(Keyword record);

    int insertSelective(Keyword record);

    Keyword selectByPrimaryKey(Integer keyid);

    int updateByPrimaryKeySelective(Keyword record);

    int updateByPrimaryKey(Keyword record);
}