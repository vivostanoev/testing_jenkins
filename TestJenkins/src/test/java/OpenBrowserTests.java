import io.qameta.allure.Allure;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class OpenBrowserTests extends Base{

    @Test
    @DisplayName("Test Opening browser dialog")
    public void openBrowser()
    {

    }


    @Test
    @DisplayName("Test expected failure")
    public void openBrowserAndFailTest()
    {
        Allure.step("I want to fail the test");
        Assert.assertTrue(false);
    }
}
