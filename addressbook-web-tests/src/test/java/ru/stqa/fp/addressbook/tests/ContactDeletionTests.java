package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by marat on 23.04.16.
 */
public class ContactDeletionTests extends TestBase {
    @Test
    public void testUserDeletion(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().acceptModalDialog();
    }
}
