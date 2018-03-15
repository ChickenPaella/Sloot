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
	public boolean updateUser(UserVO user) {
		if (sqlSessionTemplate.update(NAMESPACE + ".updateUser", user) > 0) {
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
		return sqlSessionTemplate.selectOne(NAMESPACE + ".getUser", id);
	}

	@Override
	public List<UserVO> getUserList() {
		return sqlSessionTemplate.selectList(NAMESPACE + ".getUserList");
	}

	@Override
	public UserVO login(String id) {
		return sqlSessionTemplate.selectOne(NAMESPACE + ".getUser", id);
	}
}
