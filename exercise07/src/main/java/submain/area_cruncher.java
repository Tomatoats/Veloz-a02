package submain;


public class area_cruncher {
    private double l;
    private double w;


    public area_cruncher(double length, double width) {

        l = length;
        w = width;
        final double conversion = 0.09290304;
        double area_feet = l * w;
        double area_meters = area_feet * conversion;
        System.out.printf ("So, the room is %.3f feet by %.3f feet.\n", l, w);
        System.out.printf("Alright, so that means the area of the room is:\n%.3f square feet\n Or:\n%.3f square meters!", area_feet, area_meters);
    }}