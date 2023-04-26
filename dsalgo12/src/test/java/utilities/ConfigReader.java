package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	public static Properties prop;
	public final static String propertyFilePath="./src/test/resources/configfiles/Config.properties";
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
	public static String getgraphprevious() {
		String graphbackurl = prop.getProperty("graphbackurl");
		if (graphbackurl != null)
			return graphbackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
	public static String getLinkedListpreviuos() {
		String linkedlistbackurl = prop.getProperty("linkedlistbackurl");
		if (linkedlistbackurl != null)
			return linkedlistbackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
	
	public static String gettreepreviuos() {
		String treebackurl = prop.getProperty("treebackurl");
		if (treebackurl != null)
			return treebackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
	
	
}
