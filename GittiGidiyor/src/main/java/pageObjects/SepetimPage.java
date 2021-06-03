package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SepetimPage {
	
	public SepetimPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/tv_price")
	public WebElement sepet_price;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/basketItemProductQuantityTV")
	public WebElement urun_adedi_secimi;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='2']")
	public WebElement urun_adedi2;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/txtDelete")
	public WebElement urun_sil_btn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Evet']")
	public WebElement urun_silme_onay;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/noItemText")
	public WebElement no_item_text;
	
}
