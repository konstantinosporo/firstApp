package firstapp;

public class Firstapp {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.addFunds(150);
        System.out.println(myAccount.getLastTransaction());
        System.out.println( myAccount.getBalance());
        
    }

}
