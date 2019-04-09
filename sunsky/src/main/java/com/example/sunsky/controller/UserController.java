package com.example.sunsky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sunsky.entity.UserInfo;
import com.example.sunsky.service.UserInfoService;
import com.example.sunsky.service.impl.UserInfoServiceImp;

@RequestMapping("/userInfo")
@RestController
public class UserController {
	@Autowired
	private UserInfoService userInfoService;
	
	@PostMapping(value = "/login")
	public String userLogin(@RequestBody UserInfo userInfo) {
		
		String str=userInfoService.userLogin(userInfo);
		
		return str;
		
	}

}
