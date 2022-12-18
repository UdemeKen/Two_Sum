package org.example;

import java.util.Arrays;

public class SortingApproach {
//    Function to find a Pair in an Array with a Given Sum Using Sorting.
    public void findPair(int[] nums, int target){
//        Sort the Array in an Ascending Order.
        Arrays.sort(nums);
//        Maintain Two Indices Pointing to Endpoints of the Array.
        int low = 0;
        int high = nums.length - 1;
//        Reduce the Search Space `nums[low...high]` at each iteration of the Loop.
//        Loop Till the Search Space is Exhausted.
        while (low < high){
//            Sum Found
            if (nums[low] + nums[high] == target){
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }
//            Increment `low`Index if the Total is less than the Desired Sum.
//            Decrement `high` Index if the Total is More than the Desired Sum.
            if (nums[low] + nums[high] < target){
                low++;
            }else {
                high--;
            }
        }
//        We Reach Here if the Pair is Not Found.
        System.out.println("Pair Not Found");
    }
}
