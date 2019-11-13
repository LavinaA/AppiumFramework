package pageObjects2GeneralStore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckOutPage {
	
	public CheckOutPage(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
		}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
	public List<WebElement> productList;	
		
	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLb1")
	public List<WebElement> totalAmount;	
			
	

}
