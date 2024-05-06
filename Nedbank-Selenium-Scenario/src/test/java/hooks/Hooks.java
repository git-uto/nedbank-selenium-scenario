package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {
    @Before
    public void preActions()
    {
        webDriver =  new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    @After
    public void cleanUp()
    {
        webDriver.quit();
    }
}
