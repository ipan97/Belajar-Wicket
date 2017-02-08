package com.github.ipan97.hello;

import org.apache.wicket.markup.html.WebPage;

public class WicketPage extends WebPage {
	private static final long serialVersionUID = 1L;

	public WicketPage() {
		init();
	}

	public void init() {
		add(new PersonForm("personForm"));
	}
}
