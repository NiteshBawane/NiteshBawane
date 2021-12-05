package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropertiesUtils {
	
	 static FileInputStream fis=null;
	//1. why we need utilty--read property file
	//2. whats are inputs-- key
	//3. what will be output-- value
	
	public static  String readProperty(String key) {
		Properties prop= new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}	  
		  return prop.getProperty(key);
		
	}
	
}
