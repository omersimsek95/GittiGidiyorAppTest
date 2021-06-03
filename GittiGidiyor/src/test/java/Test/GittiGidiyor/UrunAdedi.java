package Test.GittiGidiyor;


import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Test.GittiGidiyor.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pageObjects.AramaPage;
import pageObjects.HesabimPage;
import pageObjects.HomePage;
import pageObjects.SepetimPage;
import pageObjects.UrunPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class UrunAdedi extends base{
	
	@Parameters({"aranacak_esya"})
	@Test
	public void basariliGiris(String aranacak_esya) throws IOException, InterruptedException   {
		

		HesabimPage hesabimpage=new HesabimPage(driver);
		HomePage homepage=new HomePage(driver);
		AramaPage aramapage=new AramaPage(driver);
		UrunPage urunpage=new UrunPage(driver);
		SepetimPage sepetimpage=new SepetimPage(driver);
		Random random=new Random();
		
		
		
		sepetimpage.urun_adedi_secimi.click();
		sepetimpage.urun_adedi2.click();
		
		Thread.sleep(2000);
		String urunAdedi=sepetimpage.urun_adedi_secimi.getText().toString();
		String adet="2";
		
		Assert.assertEquals(adet, urunAdedi);
		
		
		
			
			
		}
		
		
		
		
		
	
	
	@BeforeMethod
	public void BeforeMethod() throws IOException, InterruptedException 
	{		
		
		//service=startServer();
		//AndroidDriver<AndroidElement> driver = Capabilities("GittiGidiyorApp");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
	}
	

	
	

}
