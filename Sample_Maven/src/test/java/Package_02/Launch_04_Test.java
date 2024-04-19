package Package_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_04_Test {
	@Test
		public void laucnh() throws InterruptedException {
		//String url = System.getProperty("url");
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.co.uk");
		Reporter.log("package1,script-02",true);
		Thread.sleep(2000);
		driver.quit();
	}
}
