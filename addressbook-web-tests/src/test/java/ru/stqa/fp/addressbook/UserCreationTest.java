package ru.stqa.fp.addressbook;

import org.testng.annotations.Test;

public class UserCreationTest extends TestBase {

    @Test
    public void testUserCreation() {
        gotoCreateNewContactPage();
        fillContactCredentials(new ContactData("Test", "Sr", "User", "supertester", "The best tester in the world", "Apple", "Infinite Loop", "+17855463689"));
        submitContactCreating();
    }

}
