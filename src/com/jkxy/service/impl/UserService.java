package com.jkxy.service.impl;

import com.jkxy.dao.IUserDAO;
import com.jkxy.model.User;
import com.jkxy.service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean addOrUpdateUser(User user) {
		return userDAO.addOrUpdateUser(user);
	}

}
