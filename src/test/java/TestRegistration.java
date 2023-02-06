import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestRegistration extends Data{

                //переход к регистрации
                private By fieldSignIn = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/span");
                private By btnSignIn = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[4]/a");
                //икспас для поля имени
                private By username = By.xpath("//div[@class='form-group col-md-6']//input[@name='username']");
                //выбрать роль
                private By role = By.xpath("//div[@class='form-group col-md-6']//select[@name='role']");
                private By getrole = By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[1]/div[2]/select/option[4]");
                //икспас для почты
                private By email = By.xpath("//div[@class='form-group']//div[@class='input-group']//input[@name='email']");

                private By zone = By.xpath("//div[@class='form-group col-md-6']//select[@name='zone_code']");
                private By codezone = By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[4]/div[2]/select/option[5]");

                private By timezone = By.xpath("//div[@class='form-group']//select[@name='timezone']");
                private By time = By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[5]/select/option[89]");
                //поля для паролей
                private By password = By.xpath("//div[@class='form-group col-md-6']//div[@class='input-group']//input[@name='password']");
                private By password2 = By.xpath("//div[@class='form-group col-md-6']//div[@class='input-group']//input[@name='confirmed_password']");

                private By chekbox = By.xpath("//ul[@class='opt-ins list-unstyled']//label[@class='form-check']//input[@name='privacy_policy']");
                private By btnlogin = By.xpath("//button[@name='create_account']");

        @Test
        public void registration() {

                WebDriver driver = new ChromeDriver();
                Data getDate = new Data();

                driver.get(getDate.getUrl);
                driver.manage().window().maximize();
                driver.findElement(fieldSignIn).click();
                driver.findElement(btnSignIn).click();
                driver.findElement(username).sendKeys(getDate.login);
                driver.findElement(role).click();
                driver.findElement(getrole).click();
                driver.findElement(email).sendKeys(getDate.address);
                driver.findElement(zone).click();
                driver.findElement(codezone).click();
                driver.findElement(timezone).click();
                driver.findElement(time).click();
                driver.findElement(password).sendKeys(getDate.despassword);
                driver.findElement(password2).sendKeys(getDate.conpassword);
                driver.findElement(chekbox).click();
                driver.findElement(btnlogin).click();

        }
}
