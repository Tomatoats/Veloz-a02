package submain;

public class gallon_calculator {
    private int l;
    private int w;

    public gallon_calculator(int length, int width) {

        l = length;
        w = width;
        int area_feet = l * w;
        final int gallon_coverage = 350;
        int gallon = area_feet / gallon_coverage;
        if ((gallon*gallon_coverage) < area_feet)
        {
            gallon++;
        }

        System.out.printf ("Hey dawg! You're gonna need %d gallons of paint to cover %d square feet!\n", gallon, area_feet);
    }
}