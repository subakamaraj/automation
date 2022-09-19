import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class signinPOM {



		 public static void main(String[] args) throws InterruptedException {
		    
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();



		     driver.get("https://mobileworld.banyanpro.com");
		     driver.manage().window().maximize();
		     Landingpage landingpage = new Landingpage(driver);
		     Thread.sleep(1000);
 		   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
		   //  WebDriverWait wait = new WebDriverWait(driver,30);
		      landingpage.signinapplication("Suba","Suba2110");
		         
		    }
}


