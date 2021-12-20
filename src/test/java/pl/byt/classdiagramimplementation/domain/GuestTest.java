package pl.byt.classdiagramimplementation.domain;

import org.junit.jupiter.api.Test;
import pl.byt.classdiagramimplemetation.domain.Guest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GuestTest {
    @Test
    void shouldSetEmailIfValid() {
        Guest guest = new Guest();
        String email = "guest@abc.pl";
        guest.setEmail(email);
        assertEquals(email, guest.getEmail());
    }
    @Test
    void shouldSetNicknameIfValid() {
        Guest guest = new Guest();
        String nickname = "nick123";
        guest.setNickname(nickname);
        assertEquals(nickname, guest.getNickname());
    }
    @Test
    void shouldNotSetEmailIfInvalid() {
        Guest guest = new Guest();
        String email = "dummy@googlecom";
        guest.setEmail(email);
        assertNull(guest.getEmail());
    }
    @Test
    void shouldNotSetNicknameIfInvalid() {
        Guest guest = new Guest();
        String nickname = "a#$a24";
        guest.setNickname(nickname);
        assertNull(guest.getNickname());
    }
}
