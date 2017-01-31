package com.github.ipan97.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.ipan97.hello.dao.UserDao;
import com.github.ipan97.hello.model.User;

@Service
@Transactional(readOnly = true)
public class UserService {
	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = false)
	public User saveUser(User user) {
		return userDao.save(user);
	}

	@Transactional(readOnly = false)
	public User updateUser(User user) {
		return userDao.update(user);
	}

	@Transactional(readOnly = false)
	public User deleteUser(User user) {
		return userDao.delete(user);
	}

	@Transactional(readOnly = true)
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

}
