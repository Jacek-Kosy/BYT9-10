package pl.byt.classdiagramimplemetation.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class Discipline {
    private final Integer disciplineId;
    private String name;

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
