package com.github.ipan97.hello;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import com.github.ipan97.hello.model.User;

public class LoginPage extends WebPage {

	private static final long serialVersionUID = 8767950405532438970L;
	private final User user = new User();

	public LoginPage() {
		Form<?> form = new Form<Object>("form");
		form.add(new TextField<String>("userName", new PropertyModel<String>(user, "name")));
		form.add(new PasswordTextField("password", new PropertyModel<String>(user, "password")));
		form.add(new Button("submit") {
			private static final long serialVersionUID = -5538306858004227055L;

			@Override
			public void onSubmit() {
				super.onSubmit();
				if (user.getName().equalsIgnoreCase("admin") && user.getPassword().equals("admin")) {
					UserSession.getInstance().setUser(user);
					setResponsePage(MainPage.class);
				} else {
					System.out.println("Invalid username and password");
				}

			}

		});
		add(form);
	}
}
