package com.websystique.springmvc.test;

import org.apache.commons.codec.binary.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class XCoreUserTestSuite {
	private final String baseUrl;
    private final String username;
    private final String password;
    
    public static void main(String args[]){
    	XCoreUserTestSuite hs = new XCoreUserTestSuite("http://localhost:8080/XCore/", "bill", "abc123");
    	//XCoreGPSTestSuite hs = new XCoreGPSTestSuite("http://futurenetwork.dyndns.org:8080/XCore/", "geeth", "abc123");
	    ///gps/loc/{imie}/{latitude}/{longitude}/{time}/{gpsfixed}/{acc}/{input1}/{input2}/{course}/{speed}
	   // hs.getRESTResponse("um/login/test/123");
	    hs.getRESTResponse("um/access/test/123");
    }
 
    public XCoreUserTestSuite(String baseUrl, String username, String password) {
        this.baseUrl = baseUrl;
        this.username = username;
        this.password = password;
    }
 
    public void getRESTResponse(String path){
       System.out.println(getDataFromServer(path));
       
      // return "account/" + accountId;
    }
 
    String getDataFromServer(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(baseUrl + path);
            URLConnection urlConnection = setUsernamePassword(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
 
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
 
    private URLConnection setUsernamePassword(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        String authString = username + ":" + password;
        String authStringEnc = new String(Base64.encodeBase64(authString.getBytes()));
        urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
        return urlConnection;
    }
}
