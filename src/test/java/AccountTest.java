import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    public void testAccount() throws Exception {
        Account account = new Account();

        if (account == null) {
            throw new Exception("계좌생성 실패");
        }

    }

}