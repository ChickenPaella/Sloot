package com.aiolos.sloot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiolos.sloot.dao.UserDao;
import com.aiolos.sloot.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean insertUser() {
		return userDao.insertUser();
	}

	@Override
	public boolean updateUser() {
		return userDao.updateUser();
	}

	@Override
	public int deleteUser() {
		return userDao.deleteUser();
	}

	@Override
	public UserVO getUser() {
		return userDao.getUser();
	}

	@Override
	public List<UserVO> getUserList() {
		return userDao.getUserList();
	}

}
