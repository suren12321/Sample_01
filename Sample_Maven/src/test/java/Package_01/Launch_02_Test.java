package Package_01;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_02_Test {
	@Test
		public void launch() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://yahoo.com/");
		Reporter.log("package1,script-01",true);
		Thread.sleep(2000);
		driver.quit();
	}
}