import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    @Before
    public void beforeTest() {
        open("https://www.demoblaze.com/");
    }

    @After
    public void afterTest()
    {

    }
}
