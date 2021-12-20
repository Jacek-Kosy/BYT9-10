package pl.byt.classdiagramimplemetation.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
public class Field {
    private final Integer fieldId;
    private String name;
    private String address;
    private List<Discipline> disciplineList;

    public Integer getFieldId() {
        return fieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Discipline> getDisciplineList() {
        return disciplineList;
    }

    public void setDisciplineList(List<Discipline> disciplineList) {
        this.disciplineList = disciplineList;
    }
}
