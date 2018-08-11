package com.examples.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class GlobalDataStore 
{
 private Properties configFile =new Properties();//Properties Class in Java
 public static String GeckoDriver_Win;
 public static String ChromeDriver_Win;
 public static String Homepage;
 public static String Guru99HomePage;
 public static String LogCategory;
 private static Logger logger;

public static void setLogCategory(String LogFile) {
	LogCategory =LogFile;
	logger =Logger.getLogger(LogCategory);
}

public void initParameters() 
{
 String basedir =System.getProperty("user.dir");
 String propFile ="selenium.properties";
 FileInputStream fis =null;
 
 try
 {
	 System.out.println(basedir);
	 fis =new FileInputStream(basedir +"/"+"src/test/resources/" +propFile);
	 configFile.load(fis);
	 GeckoDriver_Win =configFile.getProperty("GECKO_DRIVER_WIN");
	 ChromeDriver_Win=configFile.getProperty("CHROME_DRIVER_WIN");
	 Homepage =configFile.getProperty("BASE_URL");
	 Guru99HomePage =configFile.getProperty("GURU99_HomePAGE");
 } catch(FileNotFoundException e) 
 {
	 System.out.println( "File not Found" +e.getMessage());
 }catch(IOException e) {
	 System.out.println("IO Exception " +e.getMessage());
 }
}
 
}