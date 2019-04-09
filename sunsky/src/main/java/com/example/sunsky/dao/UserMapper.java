package com.example.sunsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.sunsky.entity.UserInfo;

@Mapper
public interface UserMapper {
	/**
	 * 
	 * @param user
	 * @return
	 */
	//用户登录
	
	UserInfo userLogin(UserInfo userInfo);

}
