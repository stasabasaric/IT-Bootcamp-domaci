package domaci_VII_nedelja.testiranje;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeSearch {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.youtube.com/");
		
		wd.findElement(By.id("search")).sendKeys("Never gonna give you up");
		wd.findElement(By.cssSelector("button#search-icon-legacy")).click();
		
		Thread.sleep(2000);
		
		String trajanje = wd.findElement(By.xpath("//span[contains(text(),'3:33')]")).getAttribute("aria-label");
		
		trajanje=trajanje.replaceAll("[^0-9]", "");
		
		int min = Integer.parseInt(trajanje);
		
		int sekunde =min/100*60+min%100; // ukupna sekundaza videa
		
		
		wd.findElement(By.xpath("//body/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@class='style-scope ytd-page-manager']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]")).click();
		
		try {
		wd.manage().timeouts().implicitlyWait(sekunde-205, TimeUnit.SECONDS);
		if(wd.findElement(By.className("ytp-ad-skip-button ytp-button")) != null)
			wd.findElement(By.className("ytp-ad-skip-button ytp-button")).click();
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Nije pronadjena reklama");
		}
		
		wd.findElement(By.xpath("//ytd-compact-video-renderer[@class='style-scope ytd-compact-autoplay-renderer']//div[@id='dismissable']")).click();
	
		Thread.sleep(2000);
		
		wd.close();
	}
	
}
