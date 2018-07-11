package com.websystique.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;

@RestController
@RequestMapping("/um")
public class UserController {
   
    //-------------------Retrieve All all devices--------------------------------------------------------
     
	@RequestMapping(value = "/login/{uname}/{pcode}", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@PathVariable("uname") String uname, @PathVariable("pcode") String pcode) {
  
        if(uname.equals("test") && pcode.equals("123")){
        	return new ResponseEntity("success", HttpStatus.OK);
        }else{
        	//return new ResponseEntity ("Unknown", HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        	return new ResponseEntity("failed", HttpStatus.OK);
        }
    }
    
    
	// return a user object after successfull login
    @RequestMapping(value = "/access/{uname}/{pcode}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<User> getUser(@PathVariable("uname") String uname, @PathVariable("pcode") String pcode) {
        //System.out.println("Fetching User with id " + id);
        //User user = userService.findById(id);
        User user = new User();
 
        user.setName("TEST user");
        user.setAge(21);
        user.setId(1);
        
        /**
        if (user == null) {
        
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    	}
         **/
        

        if(uname.equals("test") && pcode.equals("123")){
        	return new ResponseEntity("success", HttpStatus.OK);
        }else{
        	//return new ResponseEntity ("Unknown", HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        	return new ResponseEntity("failed", HttpStatus.OK);
        }
 

        
    }
}
