package submain;

public class Degree_converter {
    private int degree_unit; // 1 = celsius, 2 = Fahrenheit
    private int not_converted_degree;

    public Degree_converter(int verified, int degrees){
    degree_unit = verified;
    not_converted_degree = degrees;
    double converted_degree;
    if (degree_unit == 1){
        converted_degree = (double) (not_converted_degree - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is %.0f.",converted_degree);
    }
    else
    {
        converted_degree = (double) (not_converted_degree * 9 / 5) + 32;
        System.out.printf("The temperature in Fahrenheit is %.0f.",converted_degree);

    }
    }
}

