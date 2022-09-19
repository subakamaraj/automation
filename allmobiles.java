import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class allmobiles {
@Test
	public void register() {
	  // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("samsung");
		driver.close();

	}
@Test
	public void register2() {
		 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			driver.get("https://mobileworld.banyanpro.com/mobile.html");
			driver.navigate().refresh();
			driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("lenovo");
			driver.close();
	}
@Test	
	public void register3() {
		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			driver.get("https://mobileworld.banyanpro.com/mobile.html");
			driver.navigate().refresh();
			driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("Apple");
			driver.close();
	}
@Test
	public void register4() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.get("https://mobileworld.banyanpro.com/mobile.html");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("Ap");
		driver.close();
}
@Test
public void register5() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.get("https://mobileworld.banyanpro.com/mobile.html");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("sa");
		driver.close();
}
@Test
	public void register6() {
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.get("https://mobileworld.banyanpro.com/mobile.html");
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[placeholder='Search your Mobile Name here']")).sendKeys("le");
		driver.close();
}	
}
