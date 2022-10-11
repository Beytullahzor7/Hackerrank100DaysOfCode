package com.turkcell.business.service.impl;

import java.util.ArrayList;
import java.util.List;

public class SubSetQuestion {
    public static void main(String[] args) {
        // Örnek #1: [1, 3, 1, 4, 23] dizesi ve 8 sayısı verilsin. Method True dönmeli
        // çünkü 3, 1, 4 değerleri toplamı 8e eşittir.

        // Örnek #2: [1, 3, 1, 4, 23] dizesi ve 7 sayısı verilsi. Method False dönmeli
        // çünkü hiçbir altküme (yan yana olmak koşuluyla) 7 toplamını vermiyor. 3, 4
        // değerlerinin toplamı 7 ama yan yana değiller, aralarında 1 değeri de var.

        int arr[] = {1, 3, 1, 4, 23};
        System.out.println(siraliAltKumeVarMi(arr, 8));
    }

    public static boolean siraliAltKumeVarMi(int arr[], int ulasilacakToplam) {
        List<Integer> sumOfSubList = new ArrayList<>();
        int result = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) { // [1, 2, 3, 4]
            temp = 0;
            result = 0;
            for (int j = i; j < arr.length; j++) {
                temp = arr[j];
                result += temp;
                sumOfSubList.add(result);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sumOfSubList.remove(Integer.valueOf(arr[i]));
        }

        // sumOfSubList.stream().forEach(System.out::println);

        boolean isContainTargetNumber = sumOfSubList.stream().anyMatch(i -> i.equals(ulasilacakToplam));
        return isContainTargetNumber;
    }
}
