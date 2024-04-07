package uitest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {
        driver.get("https://automationexercise.com/");

        WebElement element = driver.findElement(By.linkText("Signup / Login"));

        String actualValue = element.getText();
        String expectedValue = "Signup / Login";
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testTshirtPrice() {
        driver.get("https://automationexercise.com");

        WebElement parentElement = driver.findElement(By.cssSelector(".features_items"));

        List<WebElement> elements = parentElement.findElements(By.cssSelector(".productinfo.text-center"));
        WebElement lastElement = elements.get(elements.size() - 1);

        String text = lastElement.getText();
        String[] parts = text.split("\\n");

        String actualValue = parts[0];
        String expectedValue = "Rs. 1389";
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testContactUs() {
        driver.get("https://automationexercise.com/contact_us");

        WebElement element = driver.findElement(By.linkText("feedback@automationexercise.com"));

        String actualValue = element.getText();
        String expectedValue = "feedback@automationexercise.com";
        assertEquals(actualValue, expectedValue);
    }
}
