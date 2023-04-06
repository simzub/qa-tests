import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {
        //WebElement signInElement = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"));
        WebElement signInElement = driver.findElement(By.xpath("//a[@href='/login']"));
        Assert.assertEquals("Signup / Login", signInElement.getText());
    }
    
    @Test
    public void testTshirtPrice() {
//      WebElement signInElement = driver.findElement(By.xpath("//img[@src='/get_product_picture/43']/following-sibling::h2"));
//      WebElement signInElement = driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(36) > div > div.single-products > div.productinfo.text-center > h2"));
        List<WebElement> allItems = driver.findElements(By.cssSelector(".productinfo.text-center"));
        for (WebElement item : allItems) {
            if ("GRAPHIC DESIGN MEN T SHIRT - BLUE".equals(item.findElement(By.tagName("p")).getText())) {
                Assert.assertTrue(item.findElement(By.tagName("h2")).getText().contains("1389"));
                break;
            }
        }
    }

    @Test
    public void testContactUs() {
        driver.get("https://automationexercise.com/contact_us");
        WebElement emailElement = driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-4 > div > address > p:nth-child(3) > a > u"));
        Assert.assertEquals("feedback@automationexercise.com", emailElement.getText());
    }
}
