import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void testTitleOne() {

        driver.get("https://www.litecart.net/en/");
        driver.manage().window().maximize();

        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "LiteCart - Free shopping cart platform");

        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals(getUrl,"https://www.litecart.net/en/");

        String getPage = driver.getPageSource();
        System.out.println("Page " + getPage);
        driver.close();
    }
}
