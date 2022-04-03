package HackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumpingOnTheClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    static class Result {
        public static int jumpingOnClouds(List<Integer> c) {
            int result = 0;
            for(int i=0; i<c.size()-1; i++){
                if(i+2 < c.size() && c.get(i+2) == 0){
                    result++;
                    i++;

                }else if(i+1 < c.size() && c.get(i+1) == 0){
                    result++;
                }else{
                    result = 0;
                    break;
                }
            }
            return result;
        }
    }
}
