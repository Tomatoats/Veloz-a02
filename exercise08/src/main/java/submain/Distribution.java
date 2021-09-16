package submain;

public class Distribution {
    private int peeps;
    private int pizza;
    private int slice;

public Distribution (int people, int pizzas, int slices) {
    peeps = people;
    pizza = pizzas;
    slice = slices;

    int total_slices = pizza * slice;
    int slice_per = total_slices / peeps;
    int remainder = total_slices % peeps;
    System.out.printf("So Overall boss, we got %d people and %d pizzas for a total of %d slices.\n", peeps, pizza, total_slices);
    System.out.printf("That means each person can get %d slices, with %d slices left over.", slice_per, remainder);

}

}
