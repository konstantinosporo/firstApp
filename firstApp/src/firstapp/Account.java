package firstapp;

import java.time.LocalDateTime;

public class Account { 

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    //Starting variables
    public LocalDateTime getLastTransaction() {
        return lastTransaction;
    }

    private double balance;
    private String owner;
    private LocalDateTime lastTransaction;

    public void addFunds(double fundsToAdd) { //Method to add funds on an account
        balance += fundsToAdd;
        lastTransaction = LocalDateTime.now();
    }

    public void withdrawFunds(double fundsToWithdraw) {
        balance -= fundsToWithdraw;
        lastTransaction = LocalDateTime.now();

    }

}
