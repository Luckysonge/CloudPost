package com.cloudPost.dao;

import com.cloudPost.entity.Friends;

public interface FriendsMapper {
    int insert(Friends record);

    int insertSelective(Friends record);
}