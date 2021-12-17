package pl.byt.classdiagramimplemetation.domain;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class Game {
    private Integer gameId;
    private LocalDateTime dateTime;
    private Boolean privateFlag;
    private String score;

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
}
