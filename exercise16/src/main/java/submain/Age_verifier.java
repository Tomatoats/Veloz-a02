package submain;

public class Age_verifier {
    private int Age;

    public Age_verifier(int age){
        Age = age;

        String Verifier = (Age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(Verifier);
        /*wow this was so easy I feel like I'm misssing something. The harderst part was literally just asking
        google what Ternary operators were in java */
    }
}
