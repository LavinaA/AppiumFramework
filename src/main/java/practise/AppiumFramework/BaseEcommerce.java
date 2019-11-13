package practise.AppiumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseEcommerce {

	//public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException {
	public static AndroidDriver<MobileElement> Capabilities(String appName) throws IOException {
		
		//System.getProperty("user.dir"); This command will fetch the path till the Projevt level for any machine,eg here till AldiSelfDevelop

		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\practise\\AppiumFramework\\global.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		//System.out.println(prop.get(appName));

		File f = new File("src");
		File fs = new File(f,(String) prop.get(appName));

		DesiredCapabilities cap = new DesiredCapabilities();
		
		String device =(String) prop.get("DeviceName");

		if (device.equals("LavinaEmulator"))

		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);//name of the emulator
		}

		else if (device.equals("Android")) 

		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
		}
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//we need to access uiautomator2 element of android
		//without above steps also script is running
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");

		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap); //TODO :: Comment this line and use above line

		return driver;

	}



}
