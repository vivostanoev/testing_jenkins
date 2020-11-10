import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class OpenBrowserTests extends Base{

    @Test
    @DisplayName("Test Opening browser dialog")
    public void openBrowser() throws Exception
    {
        Allure.step("Click menu item 'Laptops'");
        $(withText("Laptops")).click();
        $(withText("MacBook air")).click();
    }


    @Test
    @DisplayName("Test expected failure")
    public void openBrowserAndFailTest()
    {
        Allure.step("I want to fail the test");
        Assert.assertTrue(false);
    }
}
