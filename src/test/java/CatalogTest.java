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
        Catalog catalog1 = new Catalog("Унитаз Lavinia Boho One Rimless 3302004R","подвесной, без бачка, горизонтальный выпуск, с сиденьем", 429.00, 449.00, "Изделие оснащено ультратонким сидением дюропласт с функцией плавного опускания и быстросъемным механизмом", 2019,true,false);
        assertEquals(catalog.name,catalog1.name);
        assertEquals(catalog.description,catalog1.description);
        assertEquals(catalog.minPrice,catalog1.minPrice);
        assertEquals(catalog.maxPrice,catalog1.maxPrice);
        assertEquals(catalog.additional,catalog1.additional);
        assertEquals(catalog.date,catalog1.date);
        assertEquals(catalog.beInUse,catalog1.beInUse);
        assertEquals(catalog.waterBox,catalog1.waterBox);
        driver.quit();

    }
}