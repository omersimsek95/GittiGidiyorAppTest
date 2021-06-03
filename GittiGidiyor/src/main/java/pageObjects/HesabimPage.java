package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HesabimPage {
	
	public HesabimPage(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Kullanıcı adı veya e-posta adresi']")
	public WebElement email_editText;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Şifreniz']")
	public WebElement sifre_editText;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Giriş Yap']")
	public WebElement giris_btn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Siparişlerim']")
	public WebElement siparislerim;
	
	@AndroidFindBy(id="com.google.android.gms:id/container")
	public List<WebElement> google_accounts;
	
	@AndroidFindBy(id="com.gittigidiyormobil:id/google_auth_button")
	public WebElement google_btn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Keşfet']")
	public WebElement kesfet;
}
