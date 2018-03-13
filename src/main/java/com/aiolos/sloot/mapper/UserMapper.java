package com.aiolos.sloot.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aiolos.sloot.dao.UserDao;
import com.aiolos.sloot.vo.UserVO;

@Repository
public class UserMapper implements UserDao {

	private static final String NAMESPACE = "user";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public boolean insertUser(UserVO user) {
		if (sqlSessionTemplate.insert(NAMESPACE + ".insertUser", user) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser(String password) {
		if (sqlSessionTemplate.update(NAMESPACE + ".updateUser", password) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int deleteUser(String id) {
		return sqlSessionTemplate.delete(NAMESPACE + ".deleteUser", id);
	}

	@Override
	public UserVO getUser(String id) {
		return sqlSessionTemplate.selectOne(NAMESPACE + ".selectUser", id);
	}

	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String id, String password) {
		UserVO user = sqlSessionTemplate.selectOne(NAMESPACE + ".selectUser", id);
		if(user.getPassword() == password) {
			return true;
		} else {
			return false;
		}
	}
}
