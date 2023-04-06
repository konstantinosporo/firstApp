package clientloanapp;

import java.util.Random;

public class IndivClient extends Client {

    private boolean isEmployed;
    private float otherIncome;

    public IndivClient() {

        super();//I dont have to input line 10
        Random randIndiv = new Random();
        this.isEmployed = randIndiv.nextBoolean();
        this.otherIncome = randIndiv.nextFloat();
    }

    public IndivClient(boolean isEmployed, float otherIncome, String firstname, String address, float annualIncome, boolean hasDefaultedBefore) {
        super(firstname, address, annualIncome, hasDefaultedBefore);
        this.isEmployed = isEmployed;
        this.otherIncome = otherIncome;
    }

    public boolean isIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public float getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(float otherIncome) {
        this.otherIncome = otherIncome;
    }

    @Override
    public float getClientScore() {
        float score = super.getClientScore();
        if (this.isEmployed) {
            score += 0.1;
        }
        score = score + 0.0001f * this.otherIncome;

        return score;
    }

}
