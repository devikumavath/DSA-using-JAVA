
class bankAccount {
    String name;
    private int password;

    public void setpassword(int pwd) {
        password = pwd;
    }

    int getpwd() {
        return this.password;
    }
}

public class AccessModifier {

    public static void main(String[] args) {

        bankAccount myAccount = new bankAccount();

        myAccount.name = "devi kumavath";
        System.out.println(myAccount.name);
        // myAccount.password = 12344;

        myAccount.setpassword(12345);
        // System.out.println(myAccount.password);
        System.out.println(myAccount.getpwd());

    }

}
