package ru.stqa.fp.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by marat on 29.03.16.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(FirefoxDriver wd) {

        super(wd);
    }
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
    public void logout() {
        click(By.linkText("Logout"));
    }

    public void stop() {
        wd.quit();
    }
}
