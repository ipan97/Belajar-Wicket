package com.github.ipan97.hello.dao;

import java.util.List;

import com.github.ipan97.hello.model.User;

public interface UserDao {
	User save(User user);
	User delete(User user);
	User update(User user);
	List<User> findAllUser();
}
