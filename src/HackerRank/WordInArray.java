package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordInArray {
    /*
    * Given a file containing n words. Given a word w and a number k. Find k words in the file occuring before occurence of w.
    * Assume that the average word size is m in the file
    * eg.
    * 0 aaa
    * 1 bbb
    * 2 ccc
    * 3 booking
    * 4 alpha
    * 5 beta
    * 6 gamma
    *
    * for k=3 and w=booking the output should be [aaa,bbb,ccc,booking]
    * similarly for k=2 and w=beta output should be [booking,alpha,beta]
    * Assume that the file size can grow very large and try to get solution with space complexity lesser than O(n)
    */

    public static void main(String[] args) {
        String[] input = {"aaa","bbb","ccc","booking","alpha","beta","gamma"};
        System.out.println(solve(input, "beta", 2));
    }

    public static List<String> solve(String[] input, String word, int k){
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList());
        int wordIndex = inputList.indexOf(word);

        if(wordIndex<0){
            System.out.println(word + " not found");
            return new ArrayList<>();
        }
        if(wordIndex-k < 0){
            inputList.subList(0, wordIndex+1);
        }
        return inputList.subList(wordIndex-k, wordIndex+1);
    }
}
