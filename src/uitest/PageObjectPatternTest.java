package uitest;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class PageObjectPatternTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        driver.get("https://automationexercise.com/contact_us");

        fillContactForm("Test Name", "test@test.com", "Test Subject", "This is a test message.");

        clickSubmitButton();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        String actualMessage = getSuccessMessageText();
        assertEquals("Success! Your details have been submitted successfully.", actualMessage);
    }

    private void fillContactForm(String name, String email, String subject, String message) {
        WebElement nameInput = driver.findElement(By.name("name"));
        nameInput.sendKeys(name);

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(email);

        WebElement subjectInput = driver.findElement(By.name("subject"));
        subjectInput.sendKeys(subject);

        WebElement messageInput = driver.findElement(By.name("message"));
        messageInput.sendKeys(message);
    }

    private void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
    }

    private String getSuccessMessageText() {
        WebElement successMessage = driver.findElement(By.cssSelector(".status.alert.alert-success"));
        return successMessage.getText();
    }
}