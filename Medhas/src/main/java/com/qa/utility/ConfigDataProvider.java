package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() {
		
		
		File src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			
			 pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
		
			System.out.println("Not able to load config file"+e.getMessage());
		}
		
	}
	
	
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
		
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
		
	}
	
	
	
     public String getqaURL() {
	  return pro.getProperty("qaURL");
	}
     
	/*
	 * public String getuatURL() { return pro.getProperty("uatURL"); }
	 * 
	 * public String getprodURL() { return pro.getProperty("prodURL"); }
	 */
     
	
     
     
	
}



