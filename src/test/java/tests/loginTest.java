package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.Dashboard;
import Pages.login;

public class loginTest extends BaseTest {

    @Test
    @Parameters({"username", "password"})
    public void testValidLogin(String username, String password) {
        driver.get("https://www.browserstack.com/users/sign_in");

       
        login loginPage = new login(driver);
        Dashboard dashboardPage = new Dashboard(driver);

       
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

       
        Assert.assertTrue(dashboardPage.getWelcomeMessage().contains("Welcome"));
    }
}
