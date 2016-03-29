package ru.stqa.fp.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by marat on 29.03.16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
    super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
    public void gotoCreateNewContactPage() {
        click(By.linkText("add new"));
    }
}
