package domaci_VII_nedelja.testiranje;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechlisticSite {
	
	public static void main(String args []) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		wd.findElement(By.name("firstname")).sendKeys("Stasa");
		
		wd.findElement(By.name("lastname")).sendKeys("Basaric");
		
		wd.findElement(By.id("sex-1")).click();
		wd.findElement(By.cssSelector("input#exp-0")).click();
	
		wd.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("27.01.2020.");
		wd.findElement(By.xpath("//input[@id='profession-1']")).click();
		
		 List<WebElement> tools = wd.findElements(By.name("tool"));
		
		tools.get(2).click();
		
		
		Select dropCont = new Select(wd.findElement(By.id("continents")));
		
		dropCont.selectByVisibleText("Europe");
		
		Select selComm = new Select(wd.findElement(By.xpath("//select[@id='selenium_commands']")));
		
		
		
		for (int i = 0; i<selComm.getOptions().size(); i++) {
			selComm.selectByIndex(i);
		}
		
		 wd.findElement(By.className("input-file")).sendKeys("C:\\Users\\basar\\Desktop\\slika.jpeg");
		
		wd.findElement(By.partialLinkText("Download")).click();
		
		Thread.sleep(1000);
		
		wd.navigate().back();
		
		Thread.sleep(1000);
		wd.findElement(By.xpath("//button[@id='submit']")).submit(); 
		
		Thread.sleep(2000);
		
		wd.close();
			
		
	}

}
