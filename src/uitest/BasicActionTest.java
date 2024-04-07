package uitest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicActionTest extends AbstractTest {

    @Test
    public void testPageTitle() {
        driver.get("https://automationexercise.com/contact_us");

        String expectedTitle = "Automation Exercise - Contact Us";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }
}
