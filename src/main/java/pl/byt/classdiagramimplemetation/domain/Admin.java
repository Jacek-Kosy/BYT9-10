package pl.byt.classdiagramimplemetation.domain;


import java.time.LocalDateTime;

public class Admin extends RegisteredUser{
    private LocalDateTime becameAdmin;

    Admin(String _name, String _email, String _phoneNumber, LocalDateTime _registrationDate){
        super(_name, _email, _phoneNumber, _registrationDate);
    }

    public Boolean giveAdminPrivileges(){
        /*if (becameAdmin.isBefore()) {
            return true;
        } else {
            return false;
        }*/

        becameAdmin = LocalDateTime.now();
        return true;
    }
}
