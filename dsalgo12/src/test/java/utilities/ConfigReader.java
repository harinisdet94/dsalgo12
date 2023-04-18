package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	 private static Properties prop;
	private final static String propertyFilePath="./src/test/resources/configfiles/Config.properties";
	public Properties init_pop()
	{
		prop=new Properties();
		try 
		{
			FileInputStream ip=new FileInputStream(propertyFilePath);
			prop.load(ip);
			ip.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	
	}
	
	public static String getHomePage() {
		String homeurl = prop.getProperty("homeurl");
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not available in the Config.properties file.");
		
	}
	public static String getLoginPage() {
		String loginurl = prop.getProperty("loginurl");
		if (loginurl != null)
			return loginurl;
		else
			throw new RuntimeException("loginurl not available in the Config.properties file.");
		
	}
	public static String getarrayprevious() {
		String arraybackurl = prop.getProperty("arraybackurl");
		if (arraybackurl != null)
			return arraybackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
}
