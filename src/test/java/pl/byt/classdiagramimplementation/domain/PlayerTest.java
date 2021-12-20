package pl.byt.classdiagramimplementation.domain;

import org.junit.jupiter.api.Test;
import pl.byt.classdiagramimplemetation.domain.Discipline;
import pl.byt.classdiagramimplemetation.domain.Field;
import pl.byt.classdiagramimplemetation.domain.Game;
import pl.byt.classdiagramimplemetation.domain.Player;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayerTest {
    private final Discipline football = new Discipline(1, "football");
    private final Field field = new Field(1, "fieldA", "Kwiatowa 3, Poznań", Collections.singletonList(football));
    private final Game match = new Game(1, football, field);

    @Test
    void shouldSetJerseyNumberIfNotTaken() {
        Player playerA = new Player(match, "playerA", "A@a.pl");
        playerA.setJerseyNumber(11);
        Player playerB = new Player(match, "playerB", "B@b.pl");
        playerB.setJerseyNumber(22);
        assertEquals(11, playerA.getJerseyNumber());
        assertEquals(22, playerB.getJerseyNumber());
    }
    @Test
    void shouldNotSetJerseyNumberIfAlreadyTaken() {
        Player playerA = new Player(match, "playerA", "A@a.pl");
        playerA.setJerseyNumber(32);
        Player playerB = new Player(match, "playerB", "B@b.pl");
        playerB.setJerseyNumber(32);
        assertEquals(32, playerA.getJerseyNumber());
        assertNull(playerB.getJerseyNumber());
    }

}
