package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsSite {
	@Test
	public void TestSSGSSite()
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gouri\\eclipse\\jee-2018-12\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ssgsonline.com");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
