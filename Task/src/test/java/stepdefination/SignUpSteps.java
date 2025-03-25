package stepdefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignUpPage;

public class SignUpSteps {

    WebDriver driver;
    SignUpPage signUpPage;

    @Given("User is on the registration page")
    public void user_is_on_registration_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();  
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000); 
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        Thread.sleep(3000);
        
        signUpPage = new SignUpPage(driver);
    }

    @When("User enters {string} {string} {string} {string}")
    public void user_enters_details(String fname, String lname, String email, String password) throws InterruptedException {
        Thread.sleep(2000); 
        signUpPage.enterDetails(fname, lname, email, password);
        Thread.sleep(3000); 
    }

    @And("Clicks on create account button")
    public void clicks_on_create_account_button() throws InterruptedException {
        Thread.sleep(2000); 
        signUpPage.clickCreateAccount();
        Thread.sleep(5000); 
    }

    @Then("Account is created successfully")
    public void account_is_created_successfully() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Account created successfully!");
        Thread.sleep(2000); 
        
      
    }
}
