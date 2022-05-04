package HackerRank;

public class RepeatedString {
    public static void main(String[] args) {
        /*
        Example
        s = 'abcac'
        n = 10

        The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

        Sample Input 0
        aba
        10

        Sample Output 0
        7
         */

        System.out.println(repeatedString("aba", 10));

    }

    public static long repeatedString(String s, long n) { // aba 10
        StringBuilder repeated = new StringBuilder();

        if(!s.contains("a")) return 0;
        if(s.length() == 1) return n;

        long carier = n % s.length();
        long repeatedStr = 0l;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                repeatedStr++;
            }
        }

        repeatedStr = (n / s.length()) * repeatedStr;
        if(carier > 0){
            for(int i=0; i<s.substring(0, (int) carier).length(); i++){
                if(s.charAt(i) == 'a'){
                    repeatedStr++;
                }
            }
        }
        return repeatedStr;
    }
}
