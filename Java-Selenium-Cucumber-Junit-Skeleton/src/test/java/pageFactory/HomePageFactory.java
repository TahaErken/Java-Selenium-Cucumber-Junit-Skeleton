package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class HomePageFactory {
WebDriver driver;

    @FindBy(id="logout")
    @CacheLookup //cache'e alır ve her seferinde baştan bulmaya çalışmaz
    WebElement button_logout;




    public HomePageFactory(WebDriver driver)
    {   this.driver=driver;

        PageFactory.initElements(driver,this);//init elements fonksiyonu çağrıldığında elementler initilaze edilir


        //Eğer AJAX aplikasyonu test ediliyorsa yukarıdaki yerine aşağıdakiler kullanılır.
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);

    /*
AJAX uygulamalarında elementlerin yüklenme zamanları değişiklik gösterebilir ve bundan dolayı
No Element Exception hatası ile sıklıkla karşılaşılabilir.
BU hatanın üstesinden gelmek için "Ajax Element Locator Factory" den yararlanılır.

    */


    }
    public void checkLogoutIsDisplayed(){

        button_logout.isDisplayed();

    }



}
