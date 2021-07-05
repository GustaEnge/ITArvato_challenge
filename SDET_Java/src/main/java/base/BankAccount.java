package base;

public class BankAccount {
    private String account;
    private String authToken;
    public BankAccount(){}

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAuthToken() {return authToken;}

    public void setAuthToken(String authToken) {this.authToken = authToken;}
}
