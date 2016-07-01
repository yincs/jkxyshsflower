package com.jkxy.action;

import java.util.Map;

import com.jkxy.model.User;
import com.jkxy.model.Userdetail;
import com.jkxy.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class userAction extends ActionSupport {

	private User user;
	private Userdetail userdetail;
	private IUserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Userdetail getUserdetail() {
		return userdetail;
	}

	public void setUserdetail(Userdetail userdetail) {
		this.userdetail = userdetail;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String addUser() throws Exception {
		Map sessiong = (Map) ActionContext.getContext().getSession();
		User user1 = new User();
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		user1.setRole(user.getRole());

		Userdetail userdetail1 = new Userdetail();
		userdetail1.setAddress(userdetail.getAddress());
		userdetail1.setCsrq(userdetail.getCsrq());
		userdetail1.setXb(userdetail.getXb());
		userdetail1.setEmail(userdetail.getEmail());
		userdetail1.setPhone(userdetail.getPhone());
		userdetail1.setAddress(userdetail.getAddress());
		userdetail1.setTruename(userdetail.getTruename());
		userdetail1.setUser(user1);
		user1.setUserdetail(userdetail1);
		if (userService.addOrUpdateUser(user1)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
