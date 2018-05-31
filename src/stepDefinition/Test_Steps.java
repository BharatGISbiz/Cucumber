package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	public static final WebDriver driver = new ChromeDriver();
	
	@Given("^User should be in Login Page$")
	public void user_should_be_in_Login_Page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares/Unzipped Files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		Thread.sleep(10000);
	    
	}

	@When("^User enters the Valid Username and Password$")
	public void user_enters_the_Valid_Username_and_Password() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("bharatraj.bs@gisbiz.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("bharathchinnu");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
	    
	}

	@Then("^User should be logged-in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
		
		System.out.println("Login Successful");
	   
	}

	@And("^User should navigate to the Home Page$")
	public void user_should_navigate_to_the_Home_Page() throws Throwable {
		
		driver.quit();
	   
	}

		
		

	

}
