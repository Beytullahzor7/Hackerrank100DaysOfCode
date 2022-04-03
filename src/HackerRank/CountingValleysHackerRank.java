package HackerRank;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingValleysHackerRank {
    /* JAVA 8 STREAM STRING TO CHARLIST
    Get the String.
    Create a List of Characters.
    Convert to String to IntStream using chars() method.
    Convert IntStream to Stream using mapToObj() method.
    Collect the elements as a List Of Characters using collect()
    Return the List.
    */

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int stepNumber = input.nextInt();
        input.nextLine();
        String paths = input.nextLine();

        System.out.println(Result.countingValleys(stepNumber, paths));
    }

    static class Result{
        public static int countingValleys(int steps, String path){
            int seaLevel = 0;
            int result = 0;

            List<Character> step = path.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            for(Character temp : step){
                if(temp.equals('U')){
                    seaLevel++;

                }else if(temp.equals('D')){
                    seaLevel--;
                }
                if(!temp.equals('U') && seaLevel == -1){
                    seaLevel++;
                }
            }
            return seaLevel;
        }
    }
}
