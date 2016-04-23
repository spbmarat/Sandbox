package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by marat on 23.04.16.
 */
public class UserDeletionTests extends TestBase {
    @Test
    public void testUserDeletion(){
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().acceptModalDialog();
    }
}
