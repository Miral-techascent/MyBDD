package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver;

    @Given("^User is on Login Page$")
    public void user_is_on_Login_Page() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }

    @Given("^Enter Uasername \"([^\"]*)\"$")
    public void enter_Uasername(String Username) {
        driver.findElement(By.id("Email")).sendKeys(Username);
    }

    @Given("^Enter Password \"([^\"]*)\"$")
    public void enter_Password(String pwd) {
        driver.findElement(By.id("Password")).sendKeys(pwd);
    }

    @Then("^click on login button$")
    public void click_on_login_button() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

}
