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

public class SepeteEkleme extends base{
	
	@Parameters({"aranacak_esya"})
	@Test
	public void basariliGiris(String aranacak_esya) throws IOException, InterruptedException   {
		

		HesabimPage hesabimpage=new HesabimPage(driver);
		HomePage homepage=new HomePage(driver);
		AramaPage aramapage=new AramaPage(driver);
		UrunPage urunpage=new UrunPage(driver);
		SepetimPage sepetimpage=new SepetimPage(driver);
		Random random=new Random();
		
		
		
		hesabimpage.kesfet.click();
		homepage.kesfet_arama_editText_cli.click();
		homepage.kesfet_arama_editText.sendKeys(aranacak_esya);
		
		Thread.sleep(1000);
		
		homepage.aranan_esya.click();
		
		int y=random.nextInt(20);
		Thread.sleep(2000);
		driver
        .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.gittigidiyormobil:id/rv_search_items\")).flingToEnd("+y+");");
		
		int secilenurunsayisi=aramapage.secilen_urun.size();
		int k=random.nextInt(secilenurunsayisi-1);
		String urunPrice=aramapage.secilen_urun.get(k).getText().toString();
		
		aramapage.secilen_urun.get(k).click();
	
		Thread.sleep(1000);
		String text="Sepete Ekle";
		
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))")); 
		urunpage.sepete_ekle.click();
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		aramapage.sepetim.click();
		Thread.sleep(2000);
		
		String sepetPrice =sepetimpage.sepet_price.getText().toString();
		
		
		
		Assert.assertEquals(sepetPrice, urunPrice);
		
		
		
			
			
		}
		
		
		
		
		
	
	
	@BeforeMethod
	public void BeforeMethod() throws IOException, InterruptedException 
	{		
		
		//service=startServer();
		//AndroidDriver<AndroidElement> driver = Capabilities("GittiGidiyorApp");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
	}
	

	
	

}
