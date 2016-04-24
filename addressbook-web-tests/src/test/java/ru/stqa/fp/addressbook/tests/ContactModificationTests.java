package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.fp.addressbook.model.ContactData;

/**
 * Created by marat on 23.04.16.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testUserModification() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoCreateNewContactPage();
            app.getContactHelper().createContact(new ContactData("Test", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689", "test1"), true);
            app.getNavigationHelper().gotoHomePage();
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactCredentials(new ContactData("TestM", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689", null), false);
        app.getContactHelper().submitContactModification();
    }
}
