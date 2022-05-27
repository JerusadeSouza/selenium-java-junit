import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    WebDriver driver;
    @Before
    public void abrirBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yugui\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void loginNoLinkedin(){

        driver.get("https://inscricoes.agilebrazil.com/users/sign_in");//Abre URL
        driver.findElement(By.linkText("Registro")).click();//clicar no link registro
        driver.findElement(By.id("user_first_name")).sendKeys("Jerusa");//Inserir nome
        driver.findElement(By.id("user_last_name")).sendKeys("Souza");//Inserir a sobrenome
        driver.findElement(By.id("user_email")).sendKeys("jerusa24souza@gmail.com");//Inserir email
        driver.findElement(By.id("user_password")).sendKeys("123456789");//Inserir a senha
        driver.findElement(By.id("user_password_confirmation")).sendKeys("123456789");//Inserir a confirmação da senha
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[6]/input")).click();//Clicar em Registro
    }
}
