package uitest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestWait extends AbstractTest {

    @Test
    public void testWait() {
        driver.get("https://automationexercise.com");

        WebElement parentElement = driver.findElement(By.cssSelector(".features_items"));

        List<WebElement> elements = parentElement.findElements(By.cssSelector(".productinfo.text-center"));

        elements.get(1).findElement(By.tagName("a")).click();

        String actualHeader = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-title.w-100")))
                .getText();

        String expectedHeader = "Added!";
        assertEquals(expectedHeader, actualHeader);
    }
}
