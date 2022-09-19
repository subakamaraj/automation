import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class signupPOM {

       public static void main(String[] args) throws InterruptedException {
		    // TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		             
		     driver.get("https://mobileworld.banyanpro.com/");
		     Landingpage landingpage2 = new Landingpage(driver);
		     landingpage2.goTo();
		     Thread.sleep(1000);
		     landingpage2.signupapplication("suba","kamaraj","suba@gmail.com","suba2110" ,"08/10/2001","9758644677","Welcome to Qualitest");
		           
		     }
   }		

	


