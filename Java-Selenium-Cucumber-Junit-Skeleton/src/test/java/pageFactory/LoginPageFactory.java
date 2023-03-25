package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPageFactory {
@FindBy(id="name")
    WebElement textbox_username;
@FindBy(id="password")
    WebElement textbox_password;
@FindBy(id="login")
    WebElement buton_login;


WebDriver driver;
public LoginPageFactory(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
    //init elements fonksiyonu çağrıldığında elementler initilaze edilir


}


public void enterUserName(String username)
{
    System.out.println("username girilmeye çalışılıyor");
    textbox_username.sendKeys(username);

}

public void enterPassword(String password)
{
    textbox_password.sendKeys(password);

}

public void clickLoginButton()
{
    buton_login.click();

}


}
