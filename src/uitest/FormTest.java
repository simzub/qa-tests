import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        driver.get("https://automationexercise.com/contact_us");
        driver.findElement(By.name("name")).sendKeys("vera");
        driver.findElement(By.name("email")).sendKeys("vera@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("vera");
        driver.findElement(By.id("message")).sendKeys("vera");
        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();

        Assert.assertTrue("Success! Your details have been submitted successfully.".equals(driver.findElement(By.cssSelector(".status.alert.alert-success")).getText()));
    }
}
