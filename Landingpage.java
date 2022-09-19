import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



		public class Landingpage {



		    WebDriver driver;
		     
		     public Landingpage(WebDriver driver)
		        {
		            this.driver=driver;
		            PageFactory.initElements(driver,this);
		        }
		        //WebElement myName = driver.findElement(By.id("myName"));
		   
		     
		     @FindBy(xpath= "//button[@type='submit']")
		     WebElement signin;
		     
		      @FindBy(css= "a[href='signup.html']")
		      WebElement signup;
		     
		     @FindBy(id =  "myName")
		     WebElement firstname;
		     
		     @FindBy(xpath = "//input[@placeholder='Last Name']")
		     WebElement lastname;
		     
		     @FindBy(xpath ="//input[@placeholder='Enter Email']")
		     WebElement email;
		     
		     @FindBy(xpath ="//input[@placeholder='Password']")
		     WebElement signuppassword;
		     
		     @FindBy(xpath ="//input[@type='date']")
		     WebElement date;
		     @FindBy(xpath ="//div[@class='col-md-2']//input[@name='gender']")
		     WebElement gender;
		     
		     @FindBy(xpath ="//input[@placeholder='91XXXXXXXXXX']")
		     WebElement mobile;
		     
		     @FindBy(css= " textarea[placeholder='Short Bio'] ")
		     WebElement shortbio;
		     
		     @FindBy(xpath= "//button[@type='submit']")
		     WebElement register;
		   //Sign In
		     
		     @FindBy(id="username")
		     WebElement username;
		     
		     @FindBy(xpath="//input[@id='password']")
		     WebElement signinpassword;
		     
		     @FindBy(xpath="//a[@type='submit']")
		     WebElement submit;
		     //action
		        public void goTo()
		        {
		            driver.get("https://mobileworld.banyanpro.com/");
		        }
		        
		        
		     public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio) throws InterruptedException
		        {
		           signin.click();
		           Thread.sleep(1000);
		            signup.click();
		            Thread.sleep(1000);
		            firstname.sendKeys(fname);
		            Thread.sleep(1000);
		            lastname.sendKeys(lname);
		            Thread.sleep(1000);
		            email.sendKeys(mail);
		            Thread.sleep(1000);
		            signuppassword.sendKeys(uppwd);
		            Thread.sleep(1000);
		            date.sendKeys(dob);
		            Thread.sleep(1000);
		            gender.click();
		            Thread.sleep(1000);
		            mobile.sendKeys(phone);
		            Thread.sleep(1000);
		            shortbio.sendKeys(bio);
		            Thread.sleep(1000);
		            register.click();
		        }
		     public void signinapplication(String name, String pwd) throws InterruptedException
		        {
		            signin.click();
		            username.sendKeys(name);
		            Thread.sleep(1000);
		            signinpassword.sendKeys(pwd);
		            Thread.sleep(1000);
		            submit.click();
		        }
		     //all mobiles 
		     
		     @FindBy(linkText="All Mobiles")
		     WebElement Allmobiles ;
		     
		     @FindBy(css="input[placeholder='Search your Mobile name here']")
		     WebElement Search;
		     
		     @FindBy(linkText="All Mobiles")
		     WebElement allmobiles ;
		     
		     @FindBy(css="input[placeholder='Search your Mobile name here']")
		     WebElement search;
		     
		     @FindBy(linkText="All mobiles")
		     WebElement AllMobiles ;
		     
		     @FindBy(css="input[placeholder='Search your Mobile name here']")
		     WebElement SERCH;
		     
		     
		     public void allMobiles(String val1,String val2, String val3) throws InterruptedException
		     {
		          Allmobiles.click();
		          Search.sendKeys(val1);
		          Thread.sleep(1000);
		          allmobiles.click();
		          search.sendKeys(val2);
		          Thread.sleep(1000);
		          Allmobiles.click();
		          SERCH.sendKeys(val3);
		          Thread.sleep(1000);
		         
		     }		     
		     
		     
		
    
 }