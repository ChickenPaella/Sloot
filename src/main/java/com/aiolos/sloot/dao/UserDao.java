package com.aiolos.sloot.dao;

import java.util.List;

import com.aiolos.sloot.vo.UserVO;

public interface UserDao {
	boolean insertUser(UserVO user);
	
	boolean updateUser(String password);
	
	int deleteUser(String id);
	
	UserVO getUser(String id);
	
	List<UserVO> getUserList();
	
	boolean login(String id, String password);
}
