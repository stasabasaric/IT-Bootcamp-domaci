package domaci_VI_nedelja.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import domaci_VI_nedelja.selenijum_kod.Webpage;

public class WebpageTest  {
	
	
  @Test
  public void TestTitle() {
	  
	  Webpage wp = new Webpage ("https://itbootcamp.rs/");
	  
	  String title = "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation"; 
	  // Moze da se kopira naslov sa web-a 
	  String test = wp.getStranica();
	  
	  Assert.assertEquals(test, title);
	  
	  
  }
}
