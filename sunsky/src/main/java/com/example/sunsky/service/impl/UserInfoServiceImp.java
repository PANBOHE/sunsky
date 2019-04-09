/**
 * <b>项目名：</b>这是一个项目<br/>
 * <b>包   名：</b>com.example.sunsky.service.impl<br/>
 * <b>文件名：</b>UserInfoServiceImp.java<br/>
 * <b>版本信息：</b>1.0.0<br/>
 * <b>日期：</b>2019年4月9日-上午11:06:02<br/>
 * <b>Copyright (c)</b> 2019 Panbo版权所有<br/>
 * 
 */
package com.example.sunsky.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sunsky.dao.UserMapper;
import com.example.sunsky.entity.UserInfo;
import com.example.sunsky.service.UserInfoService;
import com.mysql.jdbc.StringUtils;

/**
 * <b>类   名：</b>UserInfoServiceImp<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hepb<br/>
 * <b>创建时间：</b>2019年4月9日 上午11:06:02<br/>
 * <b>修改人：</b>hepb<br/>
 * <b>修改时间：</b>2019年4月9日 上午11:06:02<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br/>
 * 
 */

@Service
public class UserInfoServiceImp implements UserInfoService{
	
	
	@Autowired
    private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see com.example.sunsky.service.UserInfoService#userLogin(com.example.sunsky.entity.UserInfo)
	 */
	@Override
	public String userLogin(UserInfo userInfo) {
		System.out.println("实现类里面的参数shi"+userInfo.getUserName()+"   8888888888    "+userInfo.getUserPassword());
		
		UserInfo user =	userMapper.userLogin(userInfo);
		System.out.println(user);
		
		if(user != null){
            return  "success";
        }else{
            return  "error";
        }

	}

}
