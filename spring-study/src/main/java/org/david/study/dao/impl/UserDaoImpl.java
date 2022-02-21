package org.david.study.dao.impl;

import org.david.study.dao.UserDao;
import org.david.study.model.User;

public class UserDaoImpl implements UserDao {
	/**
	 * add user.
	 *
	 * @param user User
	 */
	@Override
	public void addUser(User user) {
		System.out.print("UserDaoImpl.addUser ");
		System.out.println("user = " + user);
	}
}
