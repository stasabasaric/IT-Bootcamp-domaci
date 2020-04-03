package domaci_III_nedelja;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SeleniumVezbanje {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\basar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("https://itbootcamp.rs/");

		wd.navigate().to("https://www.google.com");

		String url = wd.getCurrentUrl();
		System.out.println(url);

		String tab = wd.getTitle();
		System.out.println("Naslov stranice je " + tab);

		System.out.println("Duzina naslova je " + tab.length() + " karaktera");

		wd.navigate().back();

		Thread.sleep(5000);

		wd.navigate().refresh();

		url = wd.getCurrentUrl();
		System.out.println(url);

		System.out.println("Naslov stranice je " + wd.getTitle());
		System.out.println("Duzina naslova je " + wd.getTitle().length() + " karaktera");

		wd.navigate().forward();

		org.openqa.selenium.Dimension dimenzije = wd.manage().window().getSize();

		System.out.println("Default dimenzije prozora kada se otvori pretrazivac, jesu: " + dimenzije);

		wd.manage().window().maximize();

		System.out
				.println("Dimenzije kada je prozor pretrazivaca max velicine, jesu: " + wd.manage().window().getSize());

		Thread.sleep(5000);

		wd.manage().window().setSize(dimenzije);

		System.out.println(wd.manage().window().getSize());

		Thread.sleep(5000);

		wd.close();

	}

}
