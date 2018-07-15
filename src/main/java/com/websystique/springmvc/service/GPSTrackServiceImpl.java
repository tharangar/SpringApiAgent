package com.websystique.springmvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.model.Rowdata;




//@Repository
@Service("gpsTrackService")
public class GPSTrackServiceImpl implements GPSTrackService{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public GPSTrackServiceImpl(SessionFactory sessionFactory) {
	       this.sessionFactory = sessionFactory;
	}
	 




	@Override
	@Transactional
	public Rowdata saveOrUpdate(Rowdata data) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(data);
		return data;
	}
	
	

}
