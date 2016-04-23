package ru.stqa.fp.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.fp.addressbook.model.GroupData;

/**
 * Created by marat on 15.03.16.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);

    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void initGroupModification()  {
        click(By.name("edit"));
    }

    public void submitGroupModification()   {
        click(By.name("update"));
    }

}