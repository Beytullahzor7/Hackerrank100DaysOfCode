package HackerRank;

public class IsPalindromeMoreWords {
    public static void main(String[] args) {
        String str = "never odd or even";
        System.out.println(isPalindromeMoreWords(str));

    }

    public static boolean isPalindromeMoreWords(String str) {
        String noSpaceStr = str.replaceAll("\\s", "");

        StringBuilder builder = new StringBuilder(noSpaceStr).reverse();

        return builder.toString().equals(noSpaceStr);
    }
}
