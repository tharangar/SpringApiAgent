package com.websystique.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
class StartupHousekeeper {
	 
	   
    @EventListener(ContextRefreshedEvent.class)
    void contextRefreshedEvent() {
        //do whatever
    	System.out.println("Hellow static content is running hear");
    }
    



}  // clossing the class