package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User;

public interface UserDao {
	//用户注册
	public boolean reg(User user);
	//用户登录
	public boolean login(User user);
}
