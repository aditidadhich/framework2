package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksCode 
{
	WebDriver driver= null;
	
	@Before("@Smoke")
	public void setup()
	{
		System.out.println("inside: setup");
		
		WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	    driver.get("https://example.testproject.io/web/");
	}
	
	@Before(order=1)
	public void Setup1()
	{
		System.out.println("inside : Setup1");
		
	}
	@Before(value="@Smoke",order=2)
	public void Setup2()
	{
		System.out.println("inside : Setup2");
		
	}
	@After("@Smoke")
	public void teardown()
	{
		System.out.println("inside : teardown");
		driver.close();
		driver.quit();
		
	}
	
	@After(order=2)
	public void teardown1()
	{
		System.out.println("inside : teardown1");
	}
	
	@BeforeStep
	public void bStep() 
	{
		System.out.println("Inside : Before Step");
	}
	
	@AfterStep
	public void aStep() 
	{
		System.out.println("Inside : After Step");
	}
	
	 
	@Given ("I want to write a step with precondition")
	public void I_want_to_write_a_step_with_precondition() 
	{
	    System.out.println("Inside: I want to write a step with precondition");
	    
	}
	
	@And ("some other precondition")
	public void some_other_precondition() 
	{
	    System.out.println("Inside: some other precondition");
	}
	    
	
	@When ("I complete action")
	public void I_complete_action()
	{
	    System.out.println("Inside: I complete action");
	    
	}
	
	
}
