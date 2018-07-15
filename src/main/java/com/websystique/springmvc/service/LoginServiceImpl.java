package com.websystique.springmvc.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.websystique.springmvc.model.Login;

import com.websystique.springmvc.model.Rowdata;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public LoginServiceImpl(SessionFactory sessionFactory) {
	       this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public Login getLoginByID(int id) throws Exception {
		// TODO Auto-generated method stub
		return (Login) sessionFactory.getCurrentSession().load(Login.class, id);
	}

	
	@Override
	@Transactional
	public Login saveOrUpdate(Login login) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(login);
		return login; 
	}

	
	@Override
	@Transactional
	public boolean doLogin(String uname, String pword) throws Exception {
		boolean tem;
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Login.class);
		criteria.add(Restrictions.eq("username",uname ));
		criteria.add(Restrictions.eq("password", pword));
		criteria.add(Restrictions.eq("status", 1));
		List<Login> loginlist = criteria.list();
		//criteria.setMaxResults(1);
		//return (Login)criteria.uniqueResult();
		if(loginlist.size() >0){
			tem = true;
		}else{
			tem = false;
		}

		return tem;
		
	
	}



}
