import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

    private Account account;

    @BeforeEach
    public void setup() {
        account = new Account(10000);
    }

    @Test
    void testAccount() throws Exception {
    }

    @Test
    void testGetBalance() {
        assertEquals(10000, account.getBalance(),"10000원으로 계좌 생성 후 잔고 조회");

        account = new Account(1000);
        assertEquals(1000, account.getBalance());
        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    void testWithdraw(){
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

    @Test
    void testAssertDouble() {
        assertEquals(0.3333, 1/3d, 0.0001);
    }

    @Test
    void testNUllAccount() {
        account = null;
        assertNull(account);
    }

}