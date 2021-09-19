package submain;

public class BMI_calculator {
    private double pounds;
    private double inches;
    public BMI_calculator(double weight, double height) {
        pounds = weight;
        inches = height;
        String result;

        double BMI = (pounds/(inches * inches)) * 703;
        //okay so fun fact, can't do switches with doubles. So I guess I won't be doing switch.
        if (BMI < 18.5)
        {
            result = "You're underweight, you should see your doctor.";
        }
        else if (BMI > 25)
        {
             result = "You're overweight, you should see your doctor.";
        }
        else
        {
            result = "You're in the ideal weight range.";
        }
        System.out.printf("Your BMI is %.2f.\n%s", BMI, result);

    }
}
