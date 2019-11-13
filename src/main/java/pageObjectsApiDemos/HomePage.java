package pageObjectsApiDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	//1. to call the driver objects from testcase to pageobject level
	//concatenate driver using pagefactory 
	
	/*
	 * public HomePage(AppiumDriver<AndroidElement> driver) {
	 * PageFactory.initElements(driver, this); }
	 */
	
	/*
	 * public HomePage(AppiumDriver<AndroidElement> driver) {
	 * 
	 * //PageFactory.initElements(driver, this);
	 * 
	 * //super(driver); PageFactory.initElements(new AppiumFieldDecorator(driver,
	 * 20, TimeUnit.SECONDS), this);
	 * //PropertyConfigurator.configure("Log4j.properties"); }
	 */
	
	

	public HomePage(AppiumDriver<MobileElement> driver) {
		//PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
		PageFactory.initElements(driver, this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
}
