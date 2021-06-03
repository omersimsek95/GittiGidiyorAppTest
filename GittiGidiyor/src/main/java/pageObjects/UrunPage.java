package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UrunPage {
	
	public UrunPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/tv_best_deal_price")
	public WebElement best_deal_price;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sepete Ekle']")
	public WebElement sepete_ekle;
	
	
	
	
	
	
}
