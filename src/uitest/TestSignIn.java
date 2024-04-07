package uitest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class TestSignIn extends AbstractTest {

    @Test
    public void testSignIn() {
        driver.get("https://automationexercise.com/signup");

        String name = "Tester";
        String email = "test" + UUID.randomUUID().toString() + "@test.com";
        String password = "testpass";
        String firstName = "Test";
        String lastName = "Tester";
        String address = "123 Street";
        String state = "California";
        String city = "Los Angeles";
        String zipcode = "90001";
        String mobilePhone = "1234567890";

        fillInitialSignUp(name,email);

        List<WebElement> submitButtons = driver.findElements(By.tagName("button"));
        submitButtons.get(1).click();

        fillSignupForm(password,
                firstName, lastName, address,
                state, city, zipcode, mobilePhone);

        driver.findElement(By.tagName("button")).click();

        WebElement successMessage = driver.findElement(By.cssSelector(".title.text-center"));

        String expectedMessage = "ACCOUNT CREATED!";
        String actualMessage = successMessage.getText();
        assertEquals(expectedMessage, actualMessage);

    }


    private void fillInitialSignUp(String name, String email) {
        WebElement nameInput = driver.findElement(By.name("name"));
        nameInput.sendKeys(name);

        List<WebElement> emailInputs = driver.findElements(By.name("email"));
        WebElement emailInput = emailInputs.get(1);
        emailInput.sendKeys(email);
    }

    private void fillSignupForm( String password,
                                String firstName, String lastName, String address,
                                String state, String city, String zipcode, String mobilePhone) {

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement firstNameInput = driver.findElement(By.name("first_name"));
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = driver.findElement(By.name("last_name"));
        lastNameInput.sendKeys(lastName);

        WebElement addressInput = driver.findElement(By.name("address1"));
        addressInput.sendKeys(address);

        WebElement stateInput = driver.findElement(By.name("state"));
        stateInput.sendKeys(state);

        WebElement cityInput = driver.findElement(By.name("city"));
        cityInput.sendKeys(city);

        WebElement zipcodeInput = driver.findElement(By.name("zipcode"));
        zipcodeInput.sendKeys(zipcode);

        WebElement mobilePhoneInput = driver.findElement(By.name("mobile_number"));
        mobilePhoneInput.sendKeys(mobilePhone);
    }
}
