package pl.byt.classdiagramimplemetation.domain;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class Player extends Guest {
    private final Game game;
    private Integer jerseyNumber;

    public Player(Game game, String name, String email) {
        super(name, email);
        this.game = game;
        this.game.getPlayerList().add(this);
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
