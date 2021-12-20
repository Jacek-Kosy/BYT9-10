package pl.byt.classdiagramimplemetation.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class Player {
    private final Game game;
    private Integer jerseyNumber;

    public Player(Game game) {
        this.game = game;
        this.game.invitePlayer(this);
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        if (game.getPlayerList().stream().noneMatch(player -> Objects.equals(player.jerseyNumber, jerseyNumber))) {
            this.jerseyNumber = jerseyNumber;
        } else {
            log.debug("This number is already taken");
        }
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }
}
