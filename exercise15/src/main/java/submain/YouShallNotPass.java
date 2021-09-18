package submain;

public class YouShallNotPass {
    private String userpass;

    public YouShallNotPass(String Password) {
        userpass = Password;
        String actualpass = "Puppies";

        if (userpass .equals(actualpass))
        {
            System.out.printf("Welcome!");
        }
        else
        {
            System.out.printf("I don't know you.");
        }
    }
}

