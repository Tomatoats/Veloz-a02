package submain;

public class Interest_Calculator {
    private double Principal;
    private double rate;
    private double year;

    public Interest_Calculator(double principal, double interest_rate, double years){
        Principal = principal;
        rate = interest_rate;
        year = years;

        double Amount = ((1 + (rate/100)*year) *  Principal);
        double rounder = Amount % 0.01;
        if (rounder != 0 && rounder * 1000 < 5){
            Amount = Amount +0.01;
        }
        System.out.printf("After %.3f years at %.3f%%, the investment will be worth $%.2f.", year, rate, Amount);
    }



}
