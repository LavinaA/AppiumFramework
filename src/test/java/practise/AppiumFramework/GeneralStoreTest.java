package practise.AppiumFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects2GeneralStore.FormPage;
import pageObjectsApiDemos.HomePage;

public class GeneralStoreTest extends BaseEcommerce {

	public static void main(String[] args) throws IOException {

		//AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		AndroidDriver<AndroidElement> driver = null;	//TODO :: Comment this line and use above line
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		FormPage f =new FormPage(driver);
		//f.nameField.sendKeys("hello");
		
		//f.femaleOption.click();
		
		f.LetsShopButton.click();
		
		
	}

}
