package stepDefinitions;

import java.time.Duration;

import org.junit.experimental.theories.DataPoint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a;

public class Stepdefinition {
	
	WebDriver driver;
	

	

@Given("I will open {string} browser")
public void i_will_open_browser(String Browser) {
    
	if (Browser.equalsIgnoreCase("chrome")) {
		
		driver = new ChromeDriver();
		
	}
	
	else {
		driver = new EdgeDriver();
	}
}

@Then("I go to url")
public void i_go_to_url() {
    
	driver.get("https://www.saucedemo.com/v1/");
	
	
}

@When("I enter valid {string} and {string}")
public void i_enter_valid_and(String username, String password) {
	driver.findElement(By.xpath("//input[@class = 'form_input' and @name= 'user-name']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@class = 'form_input' and @name= 'password']")).sendKeys(password);
}






@When("user see the name of page {string}")
public void user_see_the_name_of_page(String pagename) {
    
	WebElement nameoflabElement = driver.findElement(By.xpath("//div[ text() = 'Products']"));
	String Actualpagename = nameoflabElement.getText();
	
	String givenname = pagename;
	
	org.testng.Assert.assertEquals(Actualpagename, givenname);
	
}



@When("I click on Menu it redirects ro a page")
public void i_click_on_menu_it_redirects_ro_a_page() throws InterruptedException {
	WebElement menu = driver.findElement(By.xpath("//button[text() = 'Open Menu']"));
	menu.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
	String expectedurl = "https://saucelabs.com/";
	String actualurl = driver.getCurrentUrl();
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualurl, expectedurl);
	driver.navigate().back();
	driver.findElement(By.xpath("//button[text() ='Close Menu' ]")).click();
	
	Thread.sleep(5000);
	
}

@Then("I close the browser")
public void i_close_the_browser() {
    driver.close();
}


@Given("I go to the browser")
public void i_go_to_the_browser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
}


@When("I nevigate to the web application url")
public void i_nevigate_to_the_web_application_url() {

	driver.get("https://www.saucedemo.com/v1/");
	
}

@When("I input the {string} and {string}")
public void i_input_the_and(String username1, String password1) {
	driver.findElement(By.xpath("//input[@class = 'form_input' and @name= 'user-name']")).sendKeys(username1);
	driver.findElement(By.xpath("//input[@class = 'form_input' and @name= 'password']")).sendKeys(password1);
	
}

@Then("I click the login button")
public void i_click_the_login_button() {
	driver.findElement(By.xpath("//input[@class = 'btn_action']")).click();
}


@Then("I quit the browser")
public void i_quit_the_browser() {
    driver.quit();
}











}

