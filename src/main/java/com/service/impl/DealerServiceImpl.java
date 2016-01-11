package com.service.impl;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DealerInfoDAO;

import com.service.DealerService;
@Service
public class DealerServiceImpl implements DealerService {

	@Autowired
	DealerInfoDAO dealerInfoDAO;
	
	@Transactional
	public boolean storeDealerInfo(LinkedHashMap<String, Object> dealerInfoMap) {
		dealerInfoDAO.storeDealerInfo(dealerInfoMap);
		return false;
	}

	

}
