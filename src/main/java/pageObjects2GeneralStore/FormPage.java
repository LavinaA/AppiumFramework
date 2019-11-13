package pageObjects2GeneralStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FormPage {
	
	public FormPage(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(driver, this);
		
		}
		
//By.id("com.androidsample.generalstore:id/nameField
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	//(By.xpath("//*[@text='Female']"))
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	private WebElement femaleOption;
	
	//driver.findElement(By.id("android:id/text1"))
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement countrySelection;
	
	//(By.id("com.androidsample.generalstore:id/btnLetsShop")
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement LetsShopButton;
	
	
	public WebElement getNameField() {
		
		System.out.println("trying to find the name field");
		return nameField;
	}
	
public WebElement getFemaleOption() {
		
		System.out.println("trying to find the female option");
		return femaleOption;
	}
	
		
	
	
}
