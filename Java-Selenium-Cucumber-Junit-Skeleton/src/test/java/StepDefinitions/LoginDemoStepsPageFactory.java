package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.internal.logging.Log4J2LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

import java.util.concurrent.TimeUnit;

public class LoginDemoStepsPageFactory {
WebDriver driver=null;
LoginPageFactory loginPF;
HomePageFactory homePF;


    @Given("browser is opened")
    public void browser_is_open() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        String projectPath= System.getProperty("user.dir");
        System.getProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        System.out.println("driver açıldı");

        loginPF=new LoginPageFactory(driver);
        homePF= new HomePageFactory(driver);






        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @And("user is on login page")
    public void userIsOnLoginPage(){
        driver.navigate().to("https://example.testproject.io/web/");
    }


    @When("user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("username girilmeye çalışılıyor");

        loginPF.enterUserName(username);
        loginPF.enterPassword(password);
        Thread.sleep(1000);

    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {

        loginPF.clickLoginButton();
    }


    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        homePF.checkLogoutIsDisplayed();
        Thread.sleep(2500);
        driver.close();
        driver.quit();

    }









}
