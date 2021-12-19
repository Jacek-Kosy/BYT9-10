package pl.byt.classdiagramimplemetation.domain;


import java.time.LocalDateTime;

public class RegisteredUser extends Guest{
    private String phoneNumber;
    private LocalDateTime registrationDate;

    RegisteredUser(String _name, String _email, String _phoneNumber, LocalDateTime _registrationDate){
        super(_name, _email);

        phoneNumber = _phoneNumber;
        registrationDate = _registrationDate;
    }

    public boolean register(){
        return true;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
}
