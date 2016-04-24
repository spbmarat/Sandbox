package ru.stqa.fp.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by marat on 29.03.16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
    super(wd);
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                &&  isElementPresent(By.tagName("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    public void gotoCreateNewContactPage() {
        if (isElementPresent(By.name("submit"))){
            return;
        }
        click(By.linkText("add new"));
    }

    public void gotoHomePage() {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText("home"));
    }

}
