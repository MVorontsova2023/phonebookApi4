package phonebookApi4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import phonebookApi4.helpers.ContactHelper;
import phonebookApi4.helpers.EmailHelper;

class CreateEmailForNewContactTest {

    EmailHelper emailHelper = new EmailHelper();
    ContactHelper contactHelper = new ContactHelper();

    @Test
    public void createEmailForNewContact() {
        Integer contactId = contactHelper.createContact();
        // Work with Email
//        Integer emailId = emailHelper.createEmail(contactId);
//        emailHelper.editEmail(emailId, contactId);
//        emailHelper.deleteEmail(emailId);

        contactHelper.deleteContact(contactId);
    }
}