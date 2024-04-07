package uitest;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FormTest extends AbstractTest {


    @Test
    public void testContactUsForm() {
        driver.get("https://automationexercise.com/contact_us");

        WebElement nameInput = driver.findElement(By.name("name"));
        nameInput.sendKeys("Test Name");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("test@test.com");

        WebElement subjectInput = driver.findElement(By.name("subject"));
        subjectInput.sendKeys("Test Subject");

        WebElement messageInput = driver.findElement(By.name("message"));
        messageInput.sendKeys("This is a test message.");

        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successMessage = driver.findElement(By.cssSelector(".status.alert.alert-success"));

        String expectedMessage = "Success! Your details have been submitted successfully.";
        String actualMessage = successMessage.getText();
        assertEquals(expectedMessage, actualMessage);
    }

}

