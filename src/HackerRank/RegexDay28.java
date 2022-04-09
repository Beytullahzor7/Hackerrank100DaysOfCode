package HackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDay28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dataNumber = input.nextInt();

        String regex = "[a-z]+[0-9]+@gmail\\.com$"; //beytullahzor7@gmail.com
        Pattern pattern = Pattern.compile(regex);

        List<String> nameList = new ArrayList<>();

        for(int i=0; i<dataNumber; i++){
            String firstName = input.next();
            String email = input.next();

            Matcher matcher = pattern.matcher(email);
            if(matcher.find()){
                nameList.add(firstName);
            }
        }

        Collections.sort(nameList);
        for(String temp : nameList){
            System.out.println(temp);
        }
    }
}
