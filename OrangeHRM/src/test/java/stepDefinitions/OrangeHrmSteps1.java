package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class OrangeHrmSteps1 {
	WebDriver driver=null;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Welcome/eclipse-workspace/OrangeHRM/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("enters the site url")
	public void enters_the_site_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
		String loginPageTitle=driver.getTitle();
		if(loginPageTitle.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("user is on login page "+ loginPageTitle);
		}
		else{
			System.out.println("user is not on login page");
			
		}
		
	}
	@When("user enters invalid username and password")
	public void enter_invalid_credentials() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(50);
		driver.findElement(By.id("btnLogin")).click();
	}
	

	@Then("error message is displayed")
	public void error_message_is_displayed() {
		String Message=driver.findElement(By.id("spanMessage")).getText();
		System.out.println("printing from code "+Message);
		
		if(Message.equalsIgnoreCase("Invalid credentials")) {
			System.out.println("not logged in");
		}
		else if(!Message.equalsIgnoreCase("Invalid credentials")) {
			System.out.println("logged in");
		}
		else {
			System.out.println("logged in successful");
		}
		
		driver.close();
		driver.quit();
	}
	@When("user enters valid username and password")
	public void enter_valid_credentials() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(50);
		driver.findElement(By.id("btnLogin")).click();
	}
	

	@And("Verify title of the page")
	public void verify_title_of_the_page() {
		String homePageTitle=driver.getTitle();
		if(homePageTitle.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("user is on home page "+ homePageTitle);
		}
		else{
			System.out.println("user is not on home page");
			
		}
	}

	@And("Verfiy dashboard header")
	public void verfiy_dashboard_header() {
		String DashBoardHeader=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
		if(DashBoardHeader.equalsIgnoreCase("Dashboard")) {
			System.out.println("user is on dashboard page "+ DashBoardHeader);
		}
		else{
			System.out.println("user is not on dashboard page");
			
		}
		
	}

	@And("click on Apply leave")
	public void click_on_Apply_leave() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[4]/div/a/img")).click();
	Thread.sleep(50);
	}

	@And("verify apply leave header")
	public void verify_apply_leave_header() {
		String leaveHeader=driver.findElement(By.xpath("//*[@id=\"apply-leave\"]/div[1]/h1")).getText();
		if(leaveHeader.equalsIgnoreCase("Apply Leave")) {
			System.out.println("user is on apply leave page "+ leaveHeader);
		}
		else{
			System.out.println("user is not on apply leave page");
			
		}
		
		
	}
	
	@And("verify No Leave Types with Leave Balance text in page")
	public void verify_No_Leave_Types_with_Leave_Balance_text_in_page() {
		String Message=driver.findElement(By.xpath("//*[@id=\"apply-leave\"]/div[2]/div")).getText();
		System.out.println(Message);
		//driver.close();
		//driver.quit();
	}
	@And("naviagte to time->attendence->my records")
	public void naviagte_to_time_attendence_myrecords() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement time=driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b"));
		WebElement attendance=driver.findElement(By.xpath("//*[@id=\"menu_attendance_Attendance\"]"));
		WebElement myrecord=driver.findElement(By.xpath("//*[@id=\"menu_attendance_viewMyAttendanceRecord\"]"));
		
		act.moveToElement(time).perform();
		act.moveToElement(attendance).perform();
		Thread.sleep(10);
		myrecord.click();
		driver.close();
		driver.quit();
	}
	
	@When("user is on hrm login page")
	public void login_page() throws InterruptedException{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(50);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	

@And("User cliks on Welcome dropdown and clicks Logout")
public void user_cliks_on_Welcome_dropdown_and_clicks_Logout() throws InterruptedException {
	WebElement drp=driver.findElement(By.linkText("Welcome Paul"));
	drp.click();
		Thread.sleep(30);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/logout");
}

@Then("user is naviagted to login page")
public void user_is_naviagted_to_login_page() {
	String loginPageTitle=driver.getTitle();
	if(loginPageTitle.equalsIgnoreCase("OrangeHRM")) {
		System.out.println("user is on login page "+ loginPageTitle);
	}
	else{
		System.out.println("user is not on login page");
		
	}
	driver.close();
	driver.quit();
	
}


@Then("user provides valid credentials")
public void user_provides_valid_credentials() throws InterruptedException {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(50);
	driver.findElement(By.id("btnLogin")).click();
}

@Then("user navigated to time->Reports->project report")
public void user_navigated_to_time_Reports_project_report() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement time=driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b"));
	WebElement reports=driver.findElement(By.xpath("//*[@id=\"menu_time_Reports\"]"));
	WebElement projectReports=driver.findElement(By.xpath("//*[@id=\"menu_time_displayProjectReportCriteria\"]"));
	
	act.moveToElement(time).perform();
	act.moveToElement(reports).perform();
	Thread.sleep(10);
	projectReports.click();
	WebElement projectNamedrp=driver.findElement(By.xpath("//*[@id=\"time_project_name\"]"));
	Select sc=new Select(projectNamedrp);
	sc.selectByVisibleText("Apache Software Foundation - ASF - Phase 1");
	WebElement fromDate=driver.findElement(By.xpath("//*[@id=\"project_date_range_from_date\"]"));
	fromDate.click();
	Thread.sleep(10);
	WebElement fromYear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
	Select fromyeardrp=new Select(fromYear);
	fromyeardrp.selectByValue("2020");
	Thread.sleep(10);
	WebElement fromMonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
	Select frommonthdrp=new Select(fromMonth);
	frommonthdrp.selectByValue("11");
	Thread.sleep(10);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]")).click();
	Thread.sleep(20);
	WebElement toDate=driver.findElement(By.xpath("//*[@id=\"project_date_range_to_date\"]"));
	toDate.click();
	Thread.sleep(10);
	WebElement toYear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
	Select toyeardrp=new Select(toYear);
	toyeardrp.selectByValue("2020");
	Thread.sleep(10);
	WebElement toMonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
	Select tomonthdrp=new Select(toMonth);
	tomonthdrp.selectByValue("11");
	Thread.sleep(10);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"viewbutton\"]")).click();
	
	
	
	
	
}

@Then("project report page should be displayed")
public void project_report_page_should_be_displayed() {
	String proheader=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/h1")).getText();
	if(proheader.equalsIgnoreCase("Project Report")) {
		System.out.println("user is on project hearder page "+ proheader);
	}
	else{
		System.out.println("user is not on project header page");
		
	}
	driver.close();
	driver.quit();
}


		
	

}
