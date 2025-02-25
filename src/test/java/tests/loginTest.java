package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Dashboard;
import Pages.login;

public class loginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://www.browserstack.com/users/sign_in");

        // Initialize page objects
        login loginPage = new login(driver);
        Dashboard dashboardPage = new Dashboard(driver);

        // Perform login
        loginPage.enterUsername("vansh@gmail.com");
        loginPage.enterPassword("1234");
        loginPage.clickLogin();

        // Validate successful login
        Assert.assertTrue(dashboardPage.getWelcomeMessage().contains("Welcome"));
    }
}
