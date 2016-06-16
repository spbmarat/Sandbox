package ru.stqa.fp.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.fp.addressbook.appmanager.ApplicationManager;

/**
 * Created by marat on 15.03.16.
 */
public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.getSessionHelper().logout();
        app.getSessionHelper().stop();
    }

}
