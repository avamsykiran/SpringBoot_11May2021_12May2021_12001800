package com.et.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.et.portal.dao.UserRepository;
import com.et.portal.entity.ETUserEntity;
import com.et.portal.model.ETUserModel;

@Service
public class UserServiceImpl implements UserService{
	
	private ETUserModel currentUser;

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private EMParser parser;
	
	@Override
	public ETUserModel register(ETUserModel user) {
		return parser.parse(repo.save(parser.parse(user)));
	}

	@Override
	public boolean login(String emailId, String password) {
		boolean status=false;
		
		if(repo.existsByEmailId(emailId)) {
			ETUserEntity userEntity = repo.findByEmailId(emailId);
			if(userEntity.getPassword().equals(password)) {
				currentUser = parser.parse(userEntity);
				status=true;
			}
		}
		
		return status;
	}

	@Override
	public void logout() {
		currentUser=null;
	}

	@Override
	public boolean isLoggedIn() {
		return currentUser!=null;
	}

	@Override
	public ETUserModel getCurrentUser() {
		return currentUser;
	}

}
