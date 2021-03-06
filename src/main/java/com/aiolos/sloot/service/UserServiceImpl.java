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
	public boolean insertUser(UserVO user) {
		return userDao.insertUser(user);
	}

	@Override
	public boolean updateUser(UserVO user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(String id) {
		return userDao.deleteUser(id);
	}

	@Override
	public UserVO getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	public List<UserVO> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public boolean login(String id, String password) {
		if(userDao.login(id).getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
