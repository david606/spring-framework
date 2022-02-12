package org.david.study.service.impl;

import org.david.study.model.User;
import org.david.study.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author david
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void addUser(User user) {
		System.out.println("user = " + user);
	}
}
