import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    @Before
    public void abrirBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yugui\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    

    @Test
    public void loginFaceboock(){


    }

    @Test
    public void loginNoLinkedin(){

    }
}
