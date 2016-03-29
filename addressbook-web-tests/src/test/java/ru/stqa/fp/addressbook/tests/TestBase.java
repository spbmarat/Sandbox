package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.fp.addressbook.appmanager.ApplicationManager;

/**
 * Created by marat on 15.03.16.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.getSessionHelper().logout();
        app.getSessionHelper().stop();
    }

}
