package clientloanapp;

import java.util.Random;

public class BusinessClient extends Client {

    private String companyName;
    private float netIncome;

    public BusinessClient() {
        super();// This line is not required
        Random rand = new Random();
        this.companyName = "Company name "+ rand.nextFloat();
        this.netIncome =  rand.nextFloat();
    }

    public BusinessClient(String companyName, float netIncome, String firstname, String address, float annualIncome, boolean hasDefaultedBefore) {
        super(firstname, address, annualIncome, hasDefaultedBefore);
        this.companyName = companyName;
        this.netIncome = netIncome;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    @Override
    public float getClientScore() {
        float score = super.getClientScore();
        if (score>0.1){
            score +=0.2;
        }
        return score;
    }

}
