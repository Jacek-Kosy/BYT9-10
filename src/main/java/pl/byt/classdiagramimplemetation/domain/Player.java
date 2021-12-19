package pl.byt.classdiagramimplemetation.domain;

public class Player extends Guest{
    private Integer jerseyNumber;

    Player(String _name, String _email){
        super(_name, _email);
    }

    public boolean setJerseyNumber(){
        return true;
    }
}
