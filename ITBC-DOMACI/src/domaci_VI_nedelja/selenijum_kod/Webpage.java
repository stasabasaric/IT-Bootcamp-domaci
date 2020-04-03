package domaci_VI_nedelja.selenijum_kod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	
	String adresa;
	
	public Webpage(String adresa) {
		this.adresa = adresa;
		
	}
	
	public String getStranica() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\basar\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.get(adresa);

		return wd.getTitle();
		
	}

}
