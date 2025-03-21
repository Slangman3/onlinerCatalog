import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsInTestBy {
    @Test
    public void byStyle(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://onliner.by");
        WebElement selectXpath = driver.findElement(By.xpath("//*[@class='g-container-outer']"));
        WebElement selectCssIntro = driver.findElement(By.cssSelector(".project-navigation__flex"));

        driver.quit();
    }

}
