package owner.tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import owner.heplers.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest extends TestBase {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        // код выполнения теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
