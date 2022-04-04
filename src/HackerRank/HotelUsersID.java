package HackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class HotelUsersID {
    public static void main(String[] args) {
        /**Given arrays for N (>= 2) users, each representing the IDs of hotels visited,
          find the common IDs of the hotels visited amongst the users.

         Input:
         userA = { 2, 3, 1 }
         userB = { 2, 5, 3 }
         userC = { 7, 3, 1 }

         Output:
         {3}

         Assumptions:
         Arrays are unsorted.

         Cases:
         1) Each array consists of distinct hotel IDs
         2) Each array may contain duplicate hotel IDs */

        int[][] hotelIds = {{2,3,1}, {2,3,5}, {2,7,3,1}};
        //System.out.println(findCommonHotelUsersId(hotelIds));
        System.out.println(findCommonHotelUsersIdSecondSolution(hotelIds));

    }

    public static List<Integer> findCommonHotelUsersId(int[][] input){
        //{{2,3,1}, {2,3,5}, {7,3,1}}
        List<List<Integer>> listOfList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

        //ref = {2,3,1}
        List<Integer> ref = listOfList.get(0);
        Set<Integer> hotel;

        for(int i=1; i<listOfList.size(); i++){
            //hotel = {2,3,5} baslangıcta bu olacak
            hotel = new HashSet<>(listOfList.get(i));
            for(int j=0; j<ref.size(); j++){
                if(!hotel.contains(ref.get(j))){
                    ref.remove(j);
                    j--;
                }
            }
        }
        return ref;
    }

    public static List<Integer> findCommonHotelUsersIdSecondSolution(int[][] input){
        List<Set<Integer>> inputList = Arrays.stream(input)
                .map(x -> Arrays.stream(x).boxed().collect(Collectors.toSet()))
                .collect(Collectors.toList());

        Map<Integer,Long> counters = inputList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> a = counters.entrySet()
                .stream()
                .filter(x -> x.getValue() >= input.length)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return a;
    }
}
