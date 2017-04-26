package com.cloudPost.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cloudPost.entity.Letter;

public interface LetterMapper {
    int deleteByPrimaryKey(Integer letterid);

    int insert(Letter record);

    int insertSelective(Letter record);
    
    List<Letter> selectByUserID(@Param("userID")String userID, @Param("sended")int sended);

    Letter selectByPrimaryKey(Integer letterid);
    
    Integer selectMaxLetterID();
    
    List<Letter> selectLimit(@Param("userID")String userID, @Param("offset")int offset, @Param("pagenum")int pagenum);

    int updateByPrimaryKeySelective(Letter record);

    int updateByPrimaryKey(Letter record);
}