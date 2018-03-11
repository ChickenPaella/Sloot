package com.aiolos.sloot.dao;

import java.util.List;

import com.aiolos.sloot.vo.UserVO;

public interface UserDao {
	boolean insertUser();
	
	boolean updateUser();
	
	int deleteUser();
	
	UserVO getUser();
	
	List<UserVO> getUserList();
}
