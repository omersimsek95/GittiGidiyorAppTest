package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Hesabım']")
	public WebElement hesabim;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Keşfetmeye Bak']")
	public WebElement kesfet_arama_editText_cli;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/appbar_search_text_autoCompleteTextView")
	public WebElement kesfet_arama_editText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='bilgisayar']")
	public WebElement aranan_esya;
}
