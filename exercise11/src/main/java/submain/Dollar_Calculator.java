package submain;

public class Dollar_Calculator {
    private double c_from;
    private double Rate;
    public Dollar_Calculator(double euro, double rate) {
        c_from = euro;
        Rate = rate;
        double c_to = euro * Rate;
        double rounder = c_to % 0.01;
        if (rounder != 0 && rounder * 1000 < 5){
            c_to = c_to +0.01;
        }
        System.out.printf("%.2f Euros with a conversion rate of %f turns into:\n$%.2f dollars!", c_from, Rate, c_to);

    }
}
