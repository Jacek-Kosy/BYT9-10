package pl.byt.classdiagramimplemetation.domain;

public class Guest {
    private String name;
    private String email;

    Guest(String _name, String _email){
        name = _name;
        email = _email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
