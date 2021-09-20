package submain;


public class highest_number {
    /* now I'm sure I could use a sort to find this but imma be honest
    I kinda forgot how to do that
     */
    private double first_number;
    private double second_number;
    private double third_number;

    public highest_number(double n1, double n2, double n3) {
        first_number = n1;
        second_number = n2;
        third_number = n3;
        double winner = 0;
        if (first_number > second_number && first_number > third_number) {
            winner = first_number;
        } else if (second_number > third_number) {
            winner = second_number;
        } else if (second_number < third_number) {
            winner = third_number;
        }
        if (winner % 1 == 0) {
            System.out.printf("The largest number is %.0f.", winner);
        } else {
            System.out.printf("The largest number is %f.", winner);
        }
    }
}
