package com.github.ipan97.hello;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import com.github.ipan97.hello.domain.Person;

public class PersonForm extends Form<Object> {
	private TextField username;
	private PasswordTextField password;
	private Button submit;
	private Person person;
	/**
	 * Author Ipan Taupik Rahman
	 */
	private static final long serialVersionUID = 1L;

	public PersonForm(String id) {
		super(id);
		init();
	}

	private void init() {
		person = new Person();
		username = new TextField<String>("username", new PropertyModel<String>(person, "email"));
		password = new PasswordTextField("password", new PropertyModel<String>(person, "password"));
		submit = new Button("submit") {
			private static final long serialVersionUID = 2905520906248773153L;

			@Override
			public void onSubmit() {
				super.onSubmit();
			}

		};
		add(username);
		add(password);
		add(submit);
	}
}
