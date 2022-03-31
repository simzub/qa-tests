import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicActionTest extends AbstractTest {
    @Test
    public void testImdbTitle() {
        driver.get("https://www.imdb.com/news/movie/?ref_=nv_nw_mv");
        WebElement element = driver.findElement(By.cssSelector(".title"));
        //
    }
}
