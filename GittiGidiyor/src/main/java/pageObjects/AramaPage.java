package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AramaPage {
	
	public AramaPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sepete Ekle']")
	public List<WebElement> sepeteEkle_btn;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/tv_price")
	public List<WebElement> secilen_urun;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sepetim']")
	public WebElement sepetim;
	
	
	
	}
