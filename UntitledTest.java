// Generated by Selenium IDE
Jlia Boiko
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.name("q")).sendKeys("gjujlf");
    driver.findElement(By.name("q")).sendKeys("gjujlf");
    driver.findElement(By.id("lga")).click();
    driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
    js.executeScript("window.scrollTo(0,1436.800048828125)");
    driver.findElement(By.cssSelector(".g:nth-child(15) .LC20lb")).click();
    driver.findElement(By.cssSelector("#header > table > tbody > tr:nth-child(3) > td")).click();
    driver.findElement(By.id("searchStr")).click();
    driver.findElement(By.id("searchStr")).sendKeys("киев");
    driver.findElement(By.id("searchButton")).click();
    driver.findElement(By.linkText("Киев")).click();
  }
}
2020