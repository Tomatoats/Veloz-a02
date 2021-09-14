package submain;

import java.util.Calendar;

public class Retirement_Calculator {
    private int age_current;
    private int age_retire;

    public Retirement_Calculator(int current_age, int retire_Age) {

        age_current = current_age;
        age_retire = retire_Age;
        int year_current = Calendar.getInstance().get(Calendar.YEAR);
        int year_needed = age_retire - age_current;
        int year_retirement = year_needed + year_current;
        System.out.printf("You can retire in %d years!\n", year_needed);
        System.out.printf("It's %d , so you can retire in the year %d ! \nYou got this dawg!", year_current, year_retirement);




    }
}