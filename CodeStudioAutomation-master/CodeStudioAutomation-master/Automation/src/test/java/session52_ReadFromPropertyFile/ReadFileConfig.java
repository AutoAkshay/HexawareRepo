package session52_ReadFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileConfig {
	
	Properties properties;
	// for XXX.properties
//	String path="C:\\automationTraining\\CodeStudio\\src\\test\\java\\session52_ReadFromPropertyFile\\Config.properties";
	// for  XXX.text
	String path="C:\\automationTraining\\CodeStudio\\src\\test\\java\\session52_ReadFromPropertyFile\\Config.txt";
	
	public ReadFileConfig() throws IOException {
		properties=new Properties();
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	}
	
	public String getURL() {
		String url=properties.getProperty("url");
		
		if(url!=null) {
			return url;
		}
		
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getUserName() {
		String userName=properties.getProperty("username");
		
		if(userName!=null) {
			return userName;
		}
		
		else
			throw new RuntimeException("userName not specified in config file");
	}
	
	public String getPassword() {
		String password=properties.getProperty("password");
		
		if(password!=null) {
			return password;
		}
		
		else
			throw new RuntimeException("password not specified in config file");
	}

}
