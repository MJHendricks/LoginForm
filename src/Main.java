
public class Main {
    public static void main(String[] args) {
        IDPass passwords = new IDPass();


        Login loginPage = new Login(passwords.getLoginInfo());

    }
}