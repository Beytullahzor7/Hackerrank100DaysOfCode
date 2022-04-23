package HackerRank;

public class CaesarCipherHackerRank {
    public static void main(String[] args) {
        /*
        Original alphabet:      abcdefghijklmnopqrstuvwxyz
        Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
        */

        System.out.println(caesarCipher("www.abc.xy", 87));
    }

    public static String caesarCipher(String s, int k) { //Hello_World!
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);

            boolean isUpperCase = Character.isUpperCase(temp);

            if(Character.isLetter(temp)){
                temp += k%26;
                if(!Character.isLetter(temp) || (isUpperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }
        return builder.toString();
    }
}
