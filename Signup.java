import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup {
@Test
	public void register() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.className("my-2")).click();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.cssSelector("input[placeholder= 'First Name']")).sendKeys("suba");
		driver.findElement(By.cssSelector("input[placeholder= 'Last Name']")).sendKeys("kamaraj");
		driver.findElement(By.cssSelector("input[placeholder= 'Enter Email']")).sendKeys("suba@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder= 'Password']")).sendKeys("Suba@2110");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("08/10/2001");
		driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
		driver.findElement(By.cssSelector("input[placeholder= '91XXXXXXXXXX']")).sendKeys("9758663489");
		driver.findElement(By.cssSelector("textarea[placeholder= 'Short Bio']")).sendKeys("happy with the service");
		driver.findElement(By.cssSelector("button[type= 'submit']")).click();
		
	}

}
