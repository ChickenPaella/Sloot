package com.aiolos.sloot.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aiolos.sloot.dao.UserDao;
import com.aiolos.sloot.vo.UserVO;

@Repository
public class UserMapper implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public boolean insertUser() {
		if(sqlSessionTemplate.insert("") > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser() {
		return false;
	}

	@Override
	public int deleteUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
