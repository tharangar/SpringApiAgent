package com.websystique.springmvc.configuration;
import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.websystique.springmvc.service.GPSTrackService;
import com.websystique.springmvc.service.GPSTrackServiceImpl;
@Configuration 
@EnableTransactionManagement
public class DBConfig {
	

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	 
	    //sessionBuilder.addAnnotatedClasses(User.class);
	 // calling from a package
	    sessionBuilder.scanPackages("com.websystique.springmvc.model");
	 
	    return sessionBuilder.buildSessionFactory();
	}
	
	
	@Autowired
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/rest");
	    dataSource.setUsername("rest");
	    dataSource.setPassword("rest");
	    return dataSource;
	}
	

	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	 
	    return transactionManager;
	}
	
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	    return properties;
	}
	
	
	// been configuration starts hear
	
	@Autowired
	@Bean(name = "gpsDao")
	public GPSTrackService getUserDao(SessionFactory sessionFactory) {
	    return new GPSTrackServiceImpl(sessionFactory);
	}
	
	
	
	
}
