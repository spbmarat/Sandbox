package ru.stqa.fp.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.fp.addressbook.model.ContactData;

public class UserCreationTest extends TestBase {

    @Test
    public void testUserCreation() {
        app.getNavigationHelper().gotoCreateNewContactPage();
        app.getContactHelper().fillContactCredentials(new ContactData("Test", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689"));
        app.getContactHelper().submitContactCreating();
    }

}
