package com.github.ipan97.hello;

import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

import com.github.ipan97.hello.model.User;

public class UserSession extends WebSession {
	private static final long serialVersionUID = 543465463354005287L;
	private User user;

	public UserSession(Request request) {
		super(request);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static UserSession getInstance() {
		return (UserSession) Session.get();
	}

}
