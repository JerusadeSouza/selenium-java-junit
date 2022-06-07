import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;


public class FormularioTest {
    WebDriver driver;



            @Test
            public void preencherFormulariosComSucesso(){
                //escolher o browser/abrir o browser
                System.setProperty("webdriver.gecko.driver","C:\\Users\\Jerusa\\Documents\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get("https://ultimateqa.com/filling-out-forms/");//digitar a url
                driver.findElement(By.id("et_pb_contact_name_0")).click();
                driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Jerusa");//preencher o campo nome 1
                driver.findElement(By.id("et_pb_contact_name_0")).click();
                driver.findElement(By.id("et_pb_contact_message_0")).sendKeys( "teste ultimate");//preencher o campo mensagem 1
                driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")).click();//clicar no botão 1
                assertEquals("Thanks for contacting us", driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div/p")).getText());//assert para validar a mensagem de sucesso

            }

}
