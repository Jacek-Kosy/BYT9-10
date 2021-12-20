package pl.byt.classdiagramimplemetation.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
    private String nickname;
    private String email;


    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }
    /**
     * Sets an email address of a guest user
     * It has to follow specific format, contain an at character and a dot afterwards
     * @param  email  an email address to be set
     */
    public void setEmail(String email) {
        if (email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            this.email = email;
        } else {
            log.debug("Invalid email!!");
        }
    }
    /**
     * Sets a nickname of a guest user
     * It has to be between 4 and 12 characters long and contain only letters and digits
     * @param  nickname  a nickname to be set
     */
    public void setNickname(String nickname) {
        if (nickname.matches("^[a-zA-Z0-9]{4,12}$")) {
            this.nickname = nickname;
        } else {
            log.debug("Invalid nickname!!");
        }
    }
}
