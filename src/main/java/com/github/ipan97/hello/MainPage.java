package com.github.ipan97.hello;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.github.ipan97.hello.model.User;
import com.github.ipan97.hello.service.UserService;

public class MainPage extends WebPage {
	@SpringBean
	private UserService service;
	private static final long serialVersionUID = 6966900104771518108L;

	public MainPage() {
		addUser();
		add(new Label("message", new Model<String>(UserSession.getInstance().getUser().getName())));
		add(new Link<String>("signOut") {
			private static final long serialVersionUID = -4489755054440227246L;

			@Override
			public void onClick() {
				UserSession.getInstance().invalidate();
				setResponsePage(LoginPage.class);
			}
		});
		PageableListView<?> pageableListView = new PageableListView<Object>("rows", service.findAllUser(), 10) {
			private static final long serialVersionUID = 5161580051976096272L;

			@Override
			protected void populateItem(ListItem<Object> item) {
				User user = (User) item.getDefaultModelObject();
				item.add(new Label("name", user.getName()));
				item.add(new Label("gender", user.getGender()));
				item.add(new Label("update", "update"));
				item.add(new Label("delete", "delete"));
			}

		};
		add(pageableListView);
		add(new AjaxPagingNavigator("nav", pageableListView));
	}

	@SuppressWarnings("unused")
	private List<User> getUserList() {
		List<User> listUser = new ArrayList<User>();
		for (int index = 0; index < 100; index++) {
			listUser.add(new User("Name" + index, index % 2 == 0 ? "Male" : "Female"));
		}
		return listUser;
	}

	private void addUser() {
		User u = new User();
		u.setId("U-001");
		u.setName("ipan");
		u.setGender("MALE");
		u.setPassword("admin");
		service.saveUser(u);
	}

}
