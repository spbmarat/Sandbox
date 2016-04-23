package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.fp.addressbook.model.ContactData;

/**
 * Created by marat on 23.04.16.
 */
public class UserModificationTests extends TestBase {
    @Test
    public void testUserModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactCredentials(new ContactData("TestM", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689"));
        app.getContactHelper().submitContactModification();
    }
}
