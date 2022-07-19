package StepsForOrangeCRM;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMCode  {
	WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside: User is on login page ");
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		 //   WebDriverManager.edgedriver().setup();
		//    driver=new EdgeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		    driver.manage().window().maximize();
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	@When("user enters username and password")
	public void user_is_on_() {
		System.out.println("Inside: user enters");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		
	}
	@And("clicks on login page")
	public void user_is_on() {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	}
	
	@When("user clicks on Go To Admin")
	public void user_is_o() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		
	}
	
	@And("user clicks on user management")
	public void user_is_() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
	}
	
	@And("user clicks on Users")
	public void user_is() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
	}
	
	@Then("Verify User Role Column")
	public void user_i() {
		boolean btn = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[3]/a")).isDisplayed();
		if ((btn==true)) {
			   
			System.out.println("User role column is present");
		}
		else {
		   
			System.out.println("User role column is absent");
	    	
	}
}

	@Then("Logout and Close Browsers")
	public void us1() {	
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		driver.close();
		driver.quit();
}
		
			
		@When("user clicks on Go To Leave")
		public void user() {
			driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
		}
		
		@And("user clicks on My Leave")
		public void use() {
			driver.findElement(By.xpath("//*[@id=\"menu_leave_viewMyLeaveList\"]")).click();
		}
		
		@Then("Verify Employee Name Column")
		public void ue() {
			driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
			boolean btn = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[4]/a")).isDisplayed();
		if ((btn== true)) {
			   
			System.out.println("Employee Name column is present");
		}
		else {
		   
			System.out.println("Employee Name column is absent");
	    	
	}
}
		@Then("Logout and Close Browser")
		public void us() {	
			driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
			driver.close();
			driver.quit();
		
	}
}