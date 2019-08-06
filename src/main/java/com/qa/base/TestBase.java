package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	public void TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\ara\\eclipse-workspace\\restapi\\src\\main\\java\\com\\qa"
					+ "\\qa\\config\\config.properties");
			prop.load(ip);
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				
			}catch (IOException e) {
				e.printStackTrace();
			}		
		
	}

}
