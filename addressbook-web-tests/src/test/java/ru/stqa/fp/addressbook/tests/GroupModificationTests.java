package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.fp.addressbook.model.GroupData;

/**
 * Created by marat on 23.04.16.
 */
public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
