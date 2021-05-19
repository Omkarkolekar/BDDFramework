
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		try{
			
		System.setProperty("webdriver.chrome.driver", "G:\\Java\\WorkspaceNew\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");
		
		}finally{
			System.out.println("finally block is always executed");
		}  
		  System.out.println("rest of the code...");  
	}

	@When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
	public void enter_the_Username_and_Password(String username, String password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		driver.findElement(By.name("btnReset")).click();
		//Actions a = Mouse.
	}

	@Then("^Close All broeser$")
	public void closebroeser() throws Throwable {
		driver.close();
	}
}
