package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.fp.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test(enabled = false)
    public void testUserCreation() {
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().gotoCreateNewContactPage();
        app.getContactHelper().createContact(new ContactData("Test", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689", "test1"));
    }

}
