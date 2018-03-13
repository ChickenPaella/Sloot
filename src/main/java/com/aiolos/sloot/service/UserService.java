package com.aiolos.sloot.service;

import java.util.List;

import com.aiolos.sloot.vo.UserVO;

public interface UserService {
	boolean insertUser(UserVO user);

	boolean updateUser(String password);

	int deleteUser(String id);

	UserVO getUser(String id);

	List<UserVO> getUserList();

	boolean login(String id, String password);
}
