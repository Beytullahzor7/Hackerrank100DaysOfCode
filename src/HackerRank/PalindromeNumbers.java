package HackerRank;

public class PalindromeNumbers {
    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(12321));
    }

    public static boolean isPalindromeNumber(int num) {

        int lastNumber;
        int reverseNumber = 0;
        int temp = num;

        while (temp != 0) { //123
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == num) {
            return true;
        }
        return false;
    }
}
