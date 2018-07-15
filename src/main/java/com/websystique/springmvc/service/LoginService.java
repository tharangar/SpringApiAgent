package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Login;

public interface LoginService {
	
	
	Login getLoginByID(int id)throws Exception;
	
	Login saveOrUpdate(Login login)throws Exception;
	
	boolean doLogin(String uname,String pword)throws Exception;
	


}
