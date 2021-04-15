package prac22Mar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create Objects
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\FebBatch\\src\\main\\resources\\config.properties");
		prop.load(fis);			//Loading file in properties
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(username);
		System.out.println(password);

	}

}
