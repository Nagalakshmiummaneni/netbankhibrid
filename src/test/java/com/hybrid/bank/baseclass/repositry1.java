package com.hybrid.bank.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

public class repositry1 {
	Properties prop;
	public Properties init_prop() throws IOException {
		 prop=new Properties();
		 FileInputStream fs=new FileInputStream("C:\\Letitbe\\javaprogram\\hybrid_Driven\\src\\test\\java\\com\\hybrid\\bank\\properties\\config.properties");
		 prop.load(fs);
			return prop;
		}
}
