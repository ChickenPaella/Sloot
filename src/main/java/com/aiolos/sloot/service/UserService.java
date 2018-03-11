package com.aiolos.sloot.service;

import java.util.List;

import com.aiolos.sloot.vo.UserVO;

public interface UserService {
boolean insertUser();
	
	boolean updateUser();
	
	int deleteUser();
	
	UserVO getUser();
	
	List<UserVO> getUserList();
}
