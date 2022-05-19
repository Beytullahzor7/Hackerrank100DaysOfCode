package HackerRank;

public class LetterChanges {
    public static void main(String[] args) {

        System.out.println(letterChanges("abcdz aetn"));
    }

    public static String letterChanges(String str) {

        char[] ch = str.toCharArray();

        for (int i=0; i<ch.length; i++) {
            if (!Character.isLetter(ch[i])) {
                continue;
            } else if (ch[i] == 'z') {
                ch[i] = 'a';
                continue;
            } else if (ch[i] == 'Z') {
                ch[i] = 'A';
                continue;
            }
            ch[i]++; //eleman degistirme islemini sağlayarak bir sonraki elemana atadım
        }
        String s = String.valueOf(ch);
        s = s.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").
                replaceAll("o", "O").replaceAll("u", "U");

        return s;
    }
}
