import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testAccount() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    void testGetBalance() {
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance(),"10000원으로 계좌 생성 후 잔고 조회");

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }
}