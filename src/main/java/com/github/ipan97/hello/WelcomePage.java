package com.github.ipan97.hello;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.model.Model;

public class WelcomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	private String action;

	public WelcomePage(String action) {
		this.action = action;
		addComponent();
	}

	public WelcomePage() {
		this.action="view";
		addComponent();
	}

	public void addComponent() {
		Form<?> form = new Form<Object>("form");
		Fragment fragment;
		if (action.equalsIgnoreCase("view")) {
			fragment = new Fragment("container", "viewFragment", this);
			fragment.add(new Label("label", new Model<String>("Hello World !")));
		} else {
			fragment = new Fragment("container", "editFragment", this);
			fragment.add(new TextField<String>("textfield", new Model<String>("Hello World")));
		}
		form.add(fragment);
		add(form);
	}
}
