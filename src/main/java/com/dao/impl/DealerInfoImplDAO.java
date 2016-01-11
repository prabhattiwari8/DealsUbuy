package com.dao.impl;

import java.util.LinkedHashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.DealerInfoDAO;
import com.model.Input;
import com.model.DealerInfo;

@Repository("DealerInfoDAO")
public class DealerInfoImplDAO implements DealerInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void storeDealerInfo(LinkedHashMap<String, Object> dealerInfoMap) {
		try{
			Session session = sessionFactory.openSession();
		  Transaction transaction = session.beginTransaction();
		  System.out.println("after begin");
		  DealerInfo dealerInfo = setDealerInfo(dealerInfoMap);
		  session.save(dealerInfo);
		  transaction.commit();
		  System.out.println("after committ");
		  session.close();
		System.out.println("saved");
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	private DealerInfo setDealerInfo(LinkedHashMap<String, Object> dealerInfoMap) {
		DealerInfo dealer = new DealerInfo();
		dealer.setEmail(dealerInfoMap.get("email").toString());
		dealer.setPassword(dealerInfoMap.get("password").toString());
		dealer.setFirstname(dealerInfoMap.get("firstname").toString());
		dealer.setLastname(dealerInfoMap.get("lastname").toString());
		//dealer.setPhone(Integer.parseInt(dealerInfoMap.get("phone").toString()));
		dealer.setPhone(Integer.parseInt("2018397096"));
		dealer.setAddress1(dealerInfoMap.get("address1").toString());
		dealer.setAddress2(dealerInfoMap.get("address2").toString());
		dealer.setPin(Integer.parseInt(dealerInfoMap.get("pin").toString()));
		dealer.setCityId(Integer.parseInt(dealerInfoMap.get("city").toString()));
		dealer.setStateId(Integer.parseInt(dealerInfoMap.get("state").toString()));
		dealer.setCountryId(Integer.parseInt(dealerInfoMap.get("country").toString()));
		return dealer;
	}

}
