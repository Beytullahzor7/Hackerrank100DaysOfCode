package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2,5,5,11};

        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }

    public static int[] twoSum(int[] nums, int target){
            // [5,6,7,8]
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{0};
    }

    public static int[] twoSumSecondSolution(int[] nums, int target){

        int temp = 0;
        Map<Integer,Integer> tempMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            temp = target - nums[i];
            if(tempMap.containsKey(temp)){
                return new int[]{i, tempMap.get(i)};
            }
            tempMap.put(nums[i], i);
        }
        return new int[]{0};
    }
}
