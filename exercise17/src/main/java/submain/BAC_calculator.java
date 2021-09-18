package submain;

public class BAC_calculator {
    private int sex;
    private int alcohol;
    private int lbs;
    private int time;
    public BAC_calculator(int gender, int ounces, int weight, int hours){
        sex = gender;
        alcohol = ounces;
        lbs = weight;
        time = hours;
        double BAC;

        if (sex == 1)
        { // male
            BAC = ((alcohol * 5.14) / lbs * 0.73 - .015 * time);
        }
        else
        { // female or dingdongs if they any number other than 1 or 2
            BAC = ((alcohol * 5.14) / lbs * 0.66 - .015 * time);
        }
        System.out.printf("Your BAC is: %f\n", BAC);
        String result = (BAC >= 0.08) ? "Don't get in front of the wheel, it isn't legal for you to drive.": "You can legally drive!";
        System.out.println(result);
    }
}
