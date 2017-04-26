package com.cloudPost.dao;

import com.cloudPost.entity.UserUser;

public interface UserUserMapper {
    int insert(UserUser record);

    int insertSelective(UserUser record);
}