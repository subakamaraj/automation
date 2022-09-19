import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



		public class AllmobilesPOM {



	    public static void main(String[] args) throws InterruptedException {
		        // TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\subalakshmi.k\\Downloads\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        Landingpage landingpage3 = new Landingpage(driver);
		        landingpage3.goTo();
		        Thread.sleep(1000);
		        landingpage3.allMobiles("samsung","lenovo","apple");

	    }
}