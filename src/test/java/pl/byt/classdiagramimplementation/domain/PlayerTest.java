package pl.byt.classdiagramimplementation.domain;

import org.junit.jupiter.api.Test;
import pl.byt.classdiagramimplemetation.domain.Game;
import pl.byt.classdiagramimplemetation.domain.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayerTest {
    private final Game match = new Game(1);

    @Test
    void shouldSetJerseyNumberIfNotTaken() {
        Player playerA = new Player(match);
        playerA.setJerseyNumber(11);
        Player playerB = new Player(match);
        playerB.setJerseyNumber(22);
        assertEquals(11, playerA.getJerseyNumber());
        assertEquals(22, playerB.getJerseyNumber());
    }
    @Test
    void shouldNotSetJerseyNumberIfAlreadyTaken() {
        Player playerA = new Player(match);
        playerA.setJerseyNumber(32);
        Player playerB = new Player(match);
        playerB.setJerseyNumber(32);
        assertEquals(32, playerA.getJerseyNumber());
        assertNull(playerB.getJerseyNumber());
    }

}
