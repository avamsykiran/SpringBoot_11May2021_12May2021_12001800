package com.et.portal.service;

import org.springframework.stereotype.Service;

import com.et.portal.entity.ETUserEntity;
import com.et.portal.model.ETUserModel;

@Service
public class EMParser {

	public ETUserEntity parse(ETUserModel source) {
		return source==null?null:
			new ETUserEntity(source.getUserId(), source.getUserName(), source.getEmailId(), source.getPassword());
	}
	
	public ETUserModel parse(ETUserEntity source) {
		return source==null?null:
			new ETUserModel(source.getUserId(), source.getUserName(), source.getEmailId(), source.getPassword());
	}
}
