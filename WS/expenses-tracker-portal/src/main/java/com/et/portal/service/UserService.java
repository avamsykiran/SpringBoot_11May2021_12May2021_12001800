package com.et.portal.service;

import com.et.portal.model.ETUserModel;

public interface UserService {
	ETUserModel register(ETUserModel user);
	boolean login(String emailId,String password);
	void logout();
	boolean isLoggedIn();
	ETUserModel getCurrentUser();
}
