package phonebookApi4;

import org.junit.jupiter.api.Test;
import phonebookApi4.helpers.ContactHelper;
import phonebookApi4.helpers.EmailHelper;

import static org.junit.jupiter.api.Assertions.*;

import phonebookApi4.helpers.ContactHelper;
import phonebookApi4.helpers.PhoneHelper;

class CreatePhoneForNewContactTest {

    PhoneHelper phoneHelper = new PhoneHelper();
    ContactHelper contactHelper = new ContactHelper();

    @Test
    public void createPhoneForNewContact() {
        Integer contactId = contactHelper.createContact();
        // Work with Phone
//        Integer phoneId = phoneHelper.createPhone(contactId);
//        phoneHelper.editPhone(phoneId, contactId);
//        phoneHelper.deletePhone(phoneId);

        contactHelper.deleteContact(contactId);
    }
}