package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashingApproach {
//  Function to FInd a Pair in an Array with a Given Sum Using Hashing
    public void findPair(int[] nums, int target){
//        Create an Empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
//        Do for Each Element
        for (int i = 0; i < nums.length; i++){
//            Check if Pair (nums[i], target-nums[i]) exist.
//            If the difference is seen before, Print the Pair
            if (map.containsKey(target - nums[i])){
                System.out.printf("Pair Found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
                return;
            }
//            Store Index of the Current Element in the Map
            map.put(nums[i], i );
        }
//        We Reach Here if the Pair is Not Found
        System.out.println("Pair Not Found");
    }
}
