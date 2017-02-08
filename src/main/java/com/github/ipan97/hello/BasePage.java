package com.github.ipan97.hello;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class BasePage extends WebPage {
	private static final long serialVersionUID = 1L;
	private String title;
	private Label welcomePage;

	public BasePage() {
		init();
	}

	public void init() {
		setTitle("Wicket Application");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
