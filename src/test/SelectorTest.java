import org.junit.Test;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {
        driver.get("https://www.imdb.com/");
        //
    }

    @Test
    public void testMovieTitle() {
        driver.get("https://www.imdb.com/title/tt5108870/?ref_=rlm");
        //
    }

    @Test
    public void testTopTvShowRating() {
        driver.get("https://www.imdb.com/chart/toptv/?ref_=nv_tvv_250");
        //
    }

    @Test
    public void testOscarWinner() {
        driver.get("https://www.imdb.com/event/ev0000003/1929/1/?ref_=acd_eh");
        //
    }
}
