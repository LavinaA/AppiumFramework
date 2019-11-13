package practise.AppiumFramework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjectsApiDemos.HomePage;

public class ApiDemoTest extends BaseEcommerce {

	public static void main(String[] args) throws IOException {

		//AndroidDriver<AndroidElement> driver = Capabilities("apiDemo");
		AndroidDriver<MobileElement> driver = Capabilities("apiDemo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath syntax -tagname[@attribute = "value"]
		//Here remember in xpath tagname is classname
		//xpath syntax also //tagname
		
		//syntax for AndroidUIAutomator ->  ("attribute(\"value\")")
		
		
		
		HomePage h = new HomePage(driver);
		h.Preference.click();
		
		/*
		 * Preferences p = new Preferences(driver); p.Dependencies.click();
		 * 
		 * PrefDependencies pd =new PrefDependencies(driver); pd.WifiSettings.click();
		 * pd.WifiSettingstext.sendKeys("hello"); pd.button.get(2).click();
		 */
		
		
		/*driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		//driver.findElementByXPath(("//android.widget.TextView[@text ='Preference']")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[@text = '3. Preference dependencies']")).click();
		  driver.findElement(By.id("android:id/checkbox")).click();
		  
		  driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		  driver.findElement(By.className("android.widget.EditText")).sendKeys("hello");*/
		  
		  //driver.findElements(By.className("android.widget.Button").get(2).click();
		
		//  driver.findElement(By.id("android:id/button1")).click();
		  
		 
		
			
		
		
	}

}

