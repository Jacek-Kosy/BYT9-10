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
    private Discipline discipline;
    private Field field;
    private final List<Player> playerList = new ArrayList<>();

    public Game(Integer gameId, LocalDateTime dateTime, Boolean privateFlag) {
        this.gameId = gameId;
        this.dateTime = dateTime;
        this.privateFlag = privateFlag;
    }

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
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Boolean getPrivateFlag() {
        return privateFlag;
    }

    public Integer getGameId() {
        return gameId;
    }
    public List<Player> getPlayerList() {
        return playerList;
    }
    public void invitePlayer(Player player) {
        this.playerList.add(player);
    }
}
