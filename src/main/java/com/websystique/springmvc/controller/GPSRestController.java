package com.websystique.springmvc.controller;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.mysql.jdbc.RowData;
import com.websystique.springmvc.model.Rowdata;
import com.websystique.springmvc.service.GPSTrackService;
import com.websystique.springmvc.service.UserService;
 
@RestController
@RequestMapping("/gps")
public class GPSRestController {
 
    @Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
 
    @Autowired
    private GPSTrackService gpsDao;
    
    //-------------------GPS DATA SPRING--------------------------------------------------------
     
    @RequestMapping(value = "/loc/{imie}/{latitude}/{longitude}/{time}/{gpsfixed}/{acc}/{input1}/{input2}/{course}/{speed}", method = RequestMethod.GET)
    public ResponseEntity<String> saveGPSLoction(@PathVariable("imie") String imie,@PathVariable("latitude") String latitude,@PathVariable("longitude") String longitude,
    		@PathVariable("time") String time,@PathVariable("gpsfixed") String gpsfixed,@PathVariable("acc") String acc,@PathVariable("input1") String input1
    		,@PathVariable("input2") String input2 ,@PathVariable("course") String course, @PathVariable("speed") String speed) {
       // List<Devices> devices= userService.findAllUsers();
    	
        if(imie == ""){
            return new ResponseEntity<String>("Data Packet Has no imie", HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }else{
        
        	Rowdata rowdata = new Rowdata();
        	Date date = new Date();
        	
        	rowdata.setDevice(imie);
        	rowdata.setLat(latitude);
        	rowdata.setLon(longitude);
        	rowdata.setTime(date);
        	rowdata.setCourse(course);
        	rowdata.setAcc(acc);
        	rowdata.setInput1(input1);
        	rowdata.setInput2(input2);
        	rowdata.setSpeed(speed);
        	
        	try {
				rowdata = gpsDao.saveOrUpdate(rowdata);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        	return new ResponseEntity<String>("OK", HttpStatus.OK);
        
        
        }
    }
    
    

    
    
    
 
 
}
