/**
 * <b>项目名：</b>这是一个项目<br/>
 * <b>包   名：</b>com.example.sunsky.service<br/>
 * <b>文件名：</b>UserInfoService.java<br/>
 * <b>版本信息：</b>1.0.0<br/>
 * <b>日期：</b>2019年4月9日-上午11:04:31<br/>
 * <b>Copyright (c)</b> 2019 Panbo版权所有<br/>
 * 
 */
package com.example.sunsky.service;

import com.example.sunsky.entity.UserInfo;

/**
 * <b>类   名：</b>UserInfoService<br/>
 * <b>类描述：</b><br/>
 * <b>创建人：</b>hepb<br/>
 * <b>创建时间：</b>2019年4月9日 上午11:04:31<br/>
 * <b>修改人：</b>hepb<br/>
 * <b>修改时间：</b>2019年4月9日 上午11:04:31<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br/>
 * 
 */
public interface UserInfoService {
	//用户登录
	public String userLogin(UserInfo userInfo);

}
