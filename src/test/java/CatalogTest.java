import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;

public class CatalogTest {
    @Test
    public void validateCode() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Илья Воронович\\IdeaProjects\\onlinerCatalog\\catalog.html");
        String allText = driver.findElementByTagName("pre").getText();
        Gson gson = new Gson();
        Catalog catalog = gson.fromJson(allText, Catalog.class);
        driver.quit();

    }
}