package pl.byt.classdiagramimplemetation.domain;

import java.time.LocalDateTime;

public class Admin {
    private final LocalDateTime becameAdmin;

    public Admin() {
        becameAdmin = LocalDateTime.now();
    }


    public LocalDateTime getBecameAdmin() {
        return becameAdmin;
    }
}
