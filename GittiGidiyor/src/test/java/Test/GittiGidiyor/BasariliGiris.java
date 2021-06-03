package Test.GittiGidiyor;


import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Test.GittiGidiyor.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pageObjects.HesabimPage;
import pageObjects.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BasariliGiris extends base{
	
	@Parameters({"gecerli_mail","gecerli_sifre"})
	@Test
	public void basariliGiris(String email,String sifre) throws IOException, InterruptedException   {
		

		HomePage homepage=new HomePage(driver);
		HesabimPage hesabimpage=new HesabimPage(driver);
		
		
		
		homepage.hesabim.click();
		//hesabimpage.email_editText.sendKeys(email);
		//hesabimpage.sifre_editText.sendKeys(sifre);
		
		//hesabimpage.giris_btn.click();
		hesabimpage.google_btn.click();
		hesabimpage.google_accounts.get(1).click();
		Thread.sleep(3000);
		
	
		
		String siparis=hesabimpage.siparislerim.getText().toString();
		
		Assert.assertEquals(siparis, "Siparişlerim");
		
		
		
		
		
		
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws IOException, InterruptedException 
	{		
		
		
		//AndroidDriver<AndroidElement> driver = Capabilities("GittiGidiyorApp");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
	}
	@BeforeTest
	public void BeforeTest()throws IOException, InterruptedException {
		
		service=startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("GittiGidiyorApp");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void AfterTest()throws IOException, InterruptedException {
		
		service.stop();
		
	}
	

	
	

}
