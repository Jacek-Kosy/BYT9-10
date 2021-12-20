package pl.byt.classdiagramimplementation.domain;

import org.junit.jupiter.api.Test;
import pl.byt.classdiagramimplemetation.domain.Account;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    @Test
    void shouldSetPasswordIfValid() {
        String password = "AbCd$#19";
        Account account = new Account("username", password);
        assertTrue(account.verifyLogin("username", password));
    }
    @Test
    void shouldNotSetPasswordIfTooShort() {
        String password = "ACd$#1";
        Account account = new Account("username", password);
        assertFalse(account.verifyLogin("username", password));
    }
    @Test
    void shouldNotSetPasswordIfItHasNoDigits() {
        String password = "AbCd$#zz";
        Account account = new Account("username", password);
        assertFalse(account.verifyLogin("username", password));
    }
    @Test
    void shouldNotSetPasswordIfItHasNoUpperCaseLetters() {
        String password = "abcd$#19";
        Account account = new Account("username", password);
        assertFalse(account.verifyLogin("username", password));
    }
    @Test
    void shouldNotSetPasswordIfItHasNoLowerCaseLetters() {
        String password = "ABCD$#19";
        Account account = new Account("username", password);
        assertFalse(account.verifyLogin("username", password));
    }
    @Test
    void shouldNotSetPasswordIfItHasNoSpecialCharacters() {
        String password = "AbCd8U19";
        Account account = new Account("username", password);
        assertFalse(account.verifyLogin("username", password));
    }
}
