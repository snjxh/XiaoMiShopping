package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User;

public interface UserDao {
	//�û�ע��
	public boolean reg(User user);
	//�û���¼
	public boolean login(User user);
}
