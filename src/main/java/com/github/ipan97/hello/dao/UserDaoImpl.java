package com.github.ipan97.hello.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.ipan97.hello.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public User delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return user;
	}

	@Override
	public User update(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<User> findAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
