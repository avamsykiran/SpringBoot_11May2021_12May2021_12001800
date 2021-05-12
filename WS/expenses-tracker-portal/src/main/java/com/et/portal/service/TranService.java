package com.et.portal.service;

import java.util.List;

import com.et.portal.model.ETUserModel;
import com.et.portal.model.TranModel;
import com.et.portal.model.TranSummary;

public interface TranService {

	TranModel save(TranModel tran);
	List<TranModel> getAllTransByUser(ETUserModel model);
	double getNetTranBalance(List<TranModel> txns);	
	TranSummary getTranSummary(List<TranModel> txns);	
}
