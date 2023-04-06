package clientloanapp;

import java.util.Random;

public class Client {

    private String firstname;
    private String address;
    private float annualIncome;
    private boolean hasDefaultedBefore;

    public Client(String firstname, String address, float annualIncome, boolean hasDefaultedBefore) {
        this.firstname = firstname;
        this.address = address;
        this.annualIncome = annualIncome;
        this.hasDefaultedBefore = hasDefaultedBefore;
    }

    public Client() {
        Random rand=new Random();
        this.firstname = "Client"+rand.nextInt();
        this.address = "Adress"+rand.nextInt();
        this.annualIncome =  rand.nextFloat();
        this.hasDefaultedBefore = rand.nextBoolean();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(float annualIncome) {
        this.annualIncome = annualIncome;
    }

    public boolean isHasDefaultedBefore() {
        return hasDefaultedBefore;
    }

    public void setHasDefaultedBefore(boolean hasDefaultedBefore) {
        this.hasDefaultedBefore = hasDefaultedBefore;
    }

    public float getClientScore() {
        float score = 0.5f;
        if (this.hasDefaultedBefore) {
            score *= 0.01;
        } else {
            score += 0.0001f * this.annualIncome;
        }
        return score;
    }
}
