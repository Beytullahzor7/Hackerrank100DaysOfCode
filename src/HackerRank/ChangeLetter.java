package HackerRank;

public class ChangeLetter {
    public static void main(String[] args) {
        char[] ch = {'a','b','c'};
        for(int i=0; i<ch.length; i++){
            ch[i]++;
        }
        System.out.println(String.valueOf(ch));
    }
}
