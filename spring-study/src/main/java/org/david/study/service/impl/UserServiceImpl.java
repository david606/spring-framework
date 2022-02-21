package org.david.study.service.impl;

import lombok.Data;
import org.david.study.dao.UserDao;
import org.david.study.model.User;
import org.david.study.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author david
 */
@Service
public class UserServiceImpl implements UserService {

	UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao setUserDao() {
		return userDao;
	}
}
