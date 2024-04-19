package Package_01;


import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_01_Test {
	@Test
		public void laucnh() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
