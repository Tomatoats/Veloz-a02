package submain;

public class the_answer {
    private int ans;
    public the_answer(int answer) {
        ans = answer;
        String result = "";

        switch (ans) {
            case 0: result = "Restart the program and only use y or n next time.";
            break;
            case 1: result = "Clean terminals and try starting again.";
            break;
            case 2: result = "Replace cables and try again.";
            break;
            case 3: result = "Replace the battery.";
                break;
            case 4: result = "Check spark plug connections.";
                break;
            case 5: result = "Get it in for service.";
                break;
            case 6: result = "Check to ensure the choke is opening and closing.";
                break;
            case 7: result = "This should not be possible.";
                break;
        }
        System.out.println(result);
    }
}
