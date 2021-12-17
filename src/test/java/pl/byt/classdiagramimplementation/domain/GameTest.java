package pl.byt.classdiagramimplementation.domain;

import org.junit.jupiter.api.Test;
import pl.byt.classdiagramimplemetation.domain.Game;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GameTest {
    @Test
    void shouldSetScoreIfGameHasAlreadyTakenPlace() {
        Game game = new Game();
        game.setDateTime(LocalDateTime.now().minusDays(1));
        String score = "2:0";
        game.setScore(score);
        assertEquals(score, game.getScore());
    }
    @Test
    void shouldNotSetScoreIfGameIsInTheFuture() {
        Game game = new Game();
        game.setDateTime(LocalDateTime.now().plusDays(1));
        String score = "1:1";
        game.setScore(score);
        assertNull(game.getScore());
    }
}
