package submain;

public class month_finder {
    private int month;

    public month_finder(int month_int) {

        month = month_int;
        String month_name;

        switch (month) {
            case 1: month_name = "The name of the month is January.";
                break;
            case 2: month_name = "The name of the month is February.";
                break;
            case 3: month_name = "The name of the month is March.";
                break;
            case 4: month_name = "The name of the month is April.";
                break;
            case 5: month_name = "The name of the month is May.";
                break;
            case 6: month_name = "The name of the month is June.";
                break;
            case 7: month_name = "The name of the month is July.";
                break;
            case 8: month_name = "The name of the month is August.";
                break;
            case 9: month_name = "The name of the month is September.";
                break;
            case 10: month_name = "The name of the month is October.";
                break;
            case 11: month_name = "The name of the month is November.";
                break;
            case 12: month_name = "The name of the month is December.";
                break;
            default: month_name = "I don't know how you got this when Solution21 doesn't allow anything besides 1-12";
                break;
        }
        System.out.println(month_name);
    }
}
