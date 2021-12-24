import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testAccount() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    void testGetBalance() {
        Account account = new Account(10000);
        if(account.getBalance() != 10000) {
            fail("getBalance() =>" + account.getBalance());
        }

        account = new Account(1000);
        if(account.getBalance() != 1000) {
            fail();
        }

        account = new Account(0);
        if(account.getBalance() != 0) {
            fail();
        }
    }
}