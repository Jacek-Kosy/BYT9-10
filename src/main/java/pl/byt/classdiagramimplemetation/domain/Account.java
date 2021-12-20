package pl.byt.classdiagramimplemetation.domain;

public class Account {
    private final String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.setPassword(password);
    }

    /**
     * Sets a password of an account
     * A password must be between 8 and 20 characters long and contain:
     * - at least one lowercase letter
     * - at least one uppercase letter
     * - at least one digit
     * - at least one special character
     * @param  password  a password to be set
     */
    public void setPassword(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")) {
            this.password = password;
        }
    }


    public boolean verifyLogin(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}
