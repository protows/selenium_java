package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NewTest {
	public WebDriver driver;
  @BeforeTest
	public void beforeClass() {
    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	driver = new FirefoxDriver();
}  
  @Test
  public void openMyBlog() {
	driver.get("https://mail.ru/");
	WebElement sportButton = driver.findElement(By.cssSelector("a.x-ph__link:nth-child(5) > span:nth-child(1)"));
    sportButton.click();
	WebElement titleSportButton = driver.findElement(By.cssSelector("span.js-button:nth-child(3) > a:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
	String TextSportButton = titleSportButton.getText();
	Assert.assertEquals("Игромаркет", TextSportButton);
}
  
 @AfterTest
  public void afterClass() {
	  driver.quit();
  }

}