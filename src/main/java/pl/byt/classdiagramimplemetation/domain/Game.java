package pl.byt.classdiagramimplemetation.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class Game {
    private final Integer gameId;
    private LocalDateTime dateTime;
    private Boolean privateFlag;
    private String score;
    private final Discipline discipline;
    private final Field field;
    private final List<Player> playerList = new ArrayList<>();

    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        if (LocalDateTime.now().isAfter(dateTime)) {
            this.score = score;
        } else {
            log.debug("The game hasn't taken place yet!");
        }
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Boolean isPrivate() {
        return privateFlag;
    }
    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag = privateFlag;
    }
    public Integer getGameId() {
        return gameId;
    }
    public Discipline getDiscipline() {
        return this.discipline;
    }
    public Field getField() {
        return this.field;
    }
    public List<Player> getPlayerList() {
        return playerList;
    }
    public void invitePlayer(Player player) {
    }
}
