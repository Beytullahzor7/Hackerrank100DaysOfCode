package HackerRank;

public class TimeConvert {
    public static void main(String[] args) {
        timeConvert(100);
    }
    public static void timeConvert(int num){

        int hour = num / 60;
        int minute = num % 60;

        System.out.printf("%d contains %d hour and %d minute", num,hour,minute);
    }
}
