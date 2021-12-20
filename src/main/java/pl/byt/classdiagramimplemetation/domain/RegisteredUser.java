package pl.byt.classdiagramimplemetation.domain;

public class RegisteredUser extends Guest {
    private Account account;

    public RegisteredUser(String nickname, String email) {
        super(nickname, email);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void register() {

    }
}
