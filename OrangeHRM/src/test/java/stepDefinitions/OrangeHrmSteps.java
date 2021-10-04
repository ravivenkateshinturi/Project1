//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.*;

//public class OrangeHrmSteps {
//	
//	//WebDriver driver=null;
//	
////	@Given("user is on OrangeHRM Login page")
////	public void user_is_on_OrangeHRM_Login_page() {
////		System.setProperty("webdriver.chrome.driver","C:/Users/Welcome/eclipse-workspace/OrangeHRM/Drivers/chromedriver.exe");
////		driver=new ChromeDriver();
////		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
////		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
////		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////		driver.manage().window().maximize();
////	}
////
////	@When("user enters (.*) and (.*)")
////	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
////		driver.findElement(By.id("txtUsername")).sendKeys(username);
////		driver.findElement(By.id("txtPassword")).sendKeys(password);
////		Thread.sleep(50);
////		
////	}
////
////	@And("Clicks on Login")
////	public void clicks_on_Login() throws InterruptedException {
////		driver.findElement(By.id("btnLogin")).click();
////		Thread.sleep(100);
////		String Message=driver.findElement(By.id("spanMessage")).getText();
////		System.out.println("printing from code "+Message);
////		
////		if(Message.equalsIgnoreCase("Invalid credentials")) {
////			System.out.println("not logged in");
////		}
////		else if(!Message.equalsIgnoreCase("Invalid credentials")) {
////			System.out.println("logged in");
////		}
////		else {
////			System.out.println("logged in successful");
////		}
////		//driver.switchTo().alert().accept();
////		//driver.switchTo().alert().dismiss();
////	
////		
////		
////	}
////
////	@Then("User is navigated to Home page")
////	public void user_is_navigated_to_Home_page() {
////		String text=driver.findElement(By.id("welcome")).getText();
////		System.out.println(text);
////		System.out.println("success sign in scenario");
////		driver.close();
////		driver.quit();
////		
////		
////		
//	}
//
//}
