package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class DictionariesAndMapsDay8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i=0; i<n; i++){
            String name = input.next();
            int phone = input.nextInt();
            input.nextLine();
            phoneBook.put(name, phone);
        }

        while (input.hasNext()){
            String s = input.nextLine(); //key

            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        input.close();
    }
}
