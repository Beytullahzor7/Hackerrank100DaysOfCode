package com.turkcell.business.service.impl;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AlphabetControl {
    public static void main(String[] args) {
        //String[] kelimeler = {"bştzhyrs", "rsyh", "ocöp"};
        //String alfabeSirasi = "defgauğıvijçklümnocöprsyhbştz";

        //-İlk girdi: Kelimeler dizisi. Örnek: ["ahmet", "ayşe", "mehmet"]
        //-İkinci girdi: Alfabe sırası Örnek: "defgauğıvijçklümnocöprsyhbştz"
        userInput();
    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input alphabet: ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 29; i++) {
            builder.append(input.next().toLowerCase());
        }
        String alphabet = builder.toString(); //alphabet

        System.out.print("How many words do you want to add: ");
        int numberWords = input.nextInt();
        input.nextLine();

        String[] words = new String[numberWords]; //words
        for (int i = 0; i < numberWords; i++) {
            words[i] = input.nextLine().toLowerCase();
        }

        System.out.println(alphabet);
        System.out.println(Arrays.toString(words));

        System.out.println(siraKontrol(words, alphabet));
    }

    public static boolean siraKontrol(String[] kelimeler, String alfabeSirasi) {
        char[] charArray = alfabeSirasi.toCharArray();
        LinkedHashMap<Character, Integer> characterIntegerHashMap = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            characterIntegerHashMap.put(ch, i + 1); //Value starts from 1
        }

        char temp;
        int value;

        //5632,3215,54215
        int[][] intArr = new int[kelimeler.length][alfabeSirasi.length()];

        for (int j = 0; j < kelimeler.length; j++) {
            for (int k = 0; k < kelimeler[j].length(); k++) {
                temp = kelimeler[j].charAt(k);
                value = characterIntegerHashMap.get(temp); //o anki charin karsılıgı olan int (a = 5)
                intArr[j][k] = value;
            }
        }

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr[i].length; j++) { //[[5, 25, 16, 2, 28], [5, 24, 27, 2], [16, 2, 25, 16, 2, 28]]
                if (intArr[i][j] < intArr[i + 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
