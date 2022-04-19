package HackerRank;

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));
    }

    public static String timeConversion(String s) { // "07:05:45PM"

        int time = Integer.parseInt(s.substring(0, 2));

        if (s.endsWith("PM") && time != 12) time += 12;
        if (s.endsWith("AM")) time %= 12;

        String timeFormat = String.format("%02d", time);

        return timeFormat + s.substring(2,8);
    }
}
