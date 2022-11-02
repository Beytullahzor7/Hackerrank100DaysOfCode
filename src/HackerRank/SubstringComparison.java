import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listOfString = new ArrayList();
        
        String s = input.nextLine();
        int k = input.nextInt();
        
        //welcometojava -> length 13, 
        for(int i=0; i<=s.length()-k; i++){
            listOfString.add(s.substring(i,i+k));
        }
        
        Collections.sort(listOfString);
        String smallest = listOfString.get(0);
        String largest = listOfString.get(listOfString.size()-1);
        
        System.out.println(smallest +"\n" + largest);   
    }
}
