import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.className("my-2")).click();
	    driver.findElement(By.className("form-control")).sendKeys("suba");
	    driver.findElement(By.id("password")).sendKeys("Suba@2110");
	    driver.findElement(By.className("btn-block")).click();
	    
	}

}
