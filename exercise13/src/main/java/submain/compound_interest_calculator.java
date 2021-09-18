package submain;

public class compound_interest_calculator {
    private double Principal;
    private double rate;
    private double year;
    private double compounded;

    public  compound_interest_calculator(double principal, double interest_rate, double years, double times_compounded){
        Principal = principal;
        rate = interest_rate;
        year = years;
        compounded = times_compounded;

        double Amount = Math.pow(((1 + ((rate/100)/compounded))),(compounded*year)) * Principal;
        double rounder = Amount % 0.01;
        if (rounder != 0 && rounder * 1000 < 5){
            Amount = Amount +0.01;
        }
        System.out.printf("So boss, $%.2f invested at %.3f%% for %.3f years compounded %.0f times per year is $%.2f.", Principal, rate, year, compounded, Amount);
    }
}
