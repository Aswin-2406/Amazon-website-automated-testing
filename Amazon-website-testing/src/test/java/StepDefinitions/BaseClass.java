package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseClass {
	ChromeDriver driver = new ChromeDriver();

@Given("User is in home page")
public void user_is_in_home_page() {
      driver.get("https://www.amazon.in");
}


@When("Click the Language Change Settings")
public void click_the_language_change_settings() {

  driver.findElement(By.className("icp-nav-link-inner")).click();
}

@And("Click language")
public void click_language() {
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/span[1]")).click();
}
@Then("Click save changes button")
public void click_save_changes_button() throws InterruptedException 
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[2]/span[1]/input[1]")).click();
	Thread.sleep(2000);
}

@And("Close the browser")
public void close_the_browser() {
   driver.quit();
}

@Given("User is in Amazon sign in page")
public void user_is_in_amazon_sign_in_page() {
    driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
	
}

@When("User enters valid username and password")
public void user_enters_valid_mobile_number_and_password() {
    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7548815022");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    
}

@And("Clicks on Sign in  Button")
public void clicks_on_sign_in_button() {
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("aswinkumar03");
}

@Then("User is navigated to Home Page")
public void user_is_navigated_to_home_page() {
	driver.findElement(By.id("signInSubmit")).click();
}

@And("Close the complete browser")
public void close_the_complete_browser() throws InterruptedException {
	Thread.sleep(4000);
	driver.quit();
}

}
