package domaci_V_nedelja.selenijum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ScreenshotPage {
	
	/*Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na drajvu.
Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i sliku(screenshot)*/


	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/domaci/selenijum/chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.youtube.com");
		
		wd.findElement(By.id("search")).sendKeys("bubble sort with hungarian dance" + Keys.ENTER);
		
		Thread.sleep(2000);
		
		TakesScreenshot ss = ((TakesScreenshot)wd);
		
		File ssFile =ss.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\basar\\Desktop\\KURS\\Zadatak_2_0309.png");
		
		FileUtils.copyFile(ssFile, destFile);
		
		Thread.sleep(2000);
		
		wd.close();
		
		

	}

}
