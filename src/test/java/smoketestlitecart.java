import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Smoke Tests")
public class smoketestlitecart {

    @Test
    public void switchlanguageTest() {

        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[1]/a/span[2]")).click();
        Lite.findElement(By.linkText("Polski")).click();
    }


    @Test
    public void lifeStoryTest() {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//a[@class='btn btn-inverse btn-lg']")).click();
        Lite.findElement(By.xpath("//div[@class='col-xs-6 col-sm-4 col-md-3']")).click();

    }


    @Test
    public void singlInGitTest() {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/span")).click();
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/form/div[6]/a[2]")).click();
    }


    @Test
    public void singlInLostPasswordTest() {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/span")).click();
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[3]/a")).click();
    }


    @Test
    public void singlInTest() {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/span")).click();
        Lite.findElement(By.linkText("Create User Account")).click();
        Lite.findElement(By.xpath("//div[@class='form-group col-md-6']//input[@name='username']")).sendKeys("qwerty");
        Lite.findElement(By.xpath("//div[@class='form-group col-md-6']//select[@name='role']")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[1]/div[2]/select/option[4]")).click();
        Lite.findElement(By.xpath("//div[@class='form-group']//div[@class='input-group']//input[@name='email']")).sendKeys("qwerty@mail.ru");
        Lite.findElement(By.xpath("//div[@class='form-group col-md-6']//select[@name='zone_code']")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[4]/div[2]/select/option[5]")).click();
        Lite.findElement(By.xpath("//div[@class='form-group']//select[@name='timezone']")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/main/div/div/form/div[5]/select/option[89]")).click();
        Lite.findElement(By.xpath("//div[@class='form-group col-md-6']//div[@class='input-group']//input[@name='password']")).sendKeys("qwerty12345");
        Lite.findElement(By.xpath("//div[@class='form-group col-md-6']//div[@class='input-group']//input[@name='confirmed_password']")).sendKeys("qwerty12345");
        Lite.findElement(By.xpath("//ul[@class='opt-ins list-unstyled']//label[@class='form-check']//input[@name='privacy_policy']")).click();
        Lite.findElement(By.xpath("//button[@name='create_account']")).click();
    }

    @Test
    public void singlInTranslationTab () {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
        Lite.findElement(By.xpath("//*[@id=\"locales\"]/tbody[6]/tr/td[1]/input")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/main/div/div[1]/div/form/div[2]/fieldset/div[1]/label/input")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/main/div/div[1]/div/form/div[2]/fieldset/div[2]/button")).click();
        Lite.findElement(By.xpath("//input[@name=username']")).sendKeys("qwerty@mail.ru");
        Lite.findElement(By.xpath("//input[@name=password']")).sendKeys("qwerty12345");
    }

    @Test
    public void forumsTests () {
        WebDriver Lite = new ChromeDriver();
        Lite.get("https://www.litecart.net/");
        Lite.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[6]/a")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/table/tbody/tr[3]/td[2]/div[1]/a")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/table/tbody/tr[7]/td[1]/div/a")).click();
        Lite.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div/a")).click(); //бaг при нажатии "Reply"
    }
}