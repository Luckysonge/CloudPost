package com.cloudPost.dao;

import java.util.List;

import com.cloudPost.entity.Notify;

public interface NotifyMapper {
    int deleteByPrimaryKey(Integer notifyid);

    int insert(Notify record);

    int insertSelective(Notify record);

    Notify selectByPrimaryKey(Integer notifyid);
    
    List<Notify> selectByUserid(String userid);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKey(Notify record);
}