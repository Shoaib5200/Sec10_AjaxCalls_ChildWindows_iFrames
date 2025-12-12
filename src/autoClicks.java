import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoClicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C://ShoaibDanish//Automation_Practice//Selenium//Chrome_Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Invoke browser
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize(); // Maximize the browser window
		
		driver.findElement(By.className("redir-a-button-center")).click();
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("a[data-nav-ref='nav_ya_signin']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform(); //Moves to the specific element
		}
}
