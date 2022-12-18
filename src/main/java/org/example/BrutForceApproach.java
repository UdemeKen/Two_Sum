package org.example;

public class BrutForceApproach {
//    Naive Method to Find a Pair in an Array with a Given Sum.
    public void findPair(int[] nums, int target){
//        Consider Each Element Except The Last.
        for (int i = 0; i < nums.length -1; i++){
//            Start From the i'th Element Until the Last Element.
            for (int j = i + 1; j < nums.length; j++){
//                If the Desired Sum is Found Print it.
                if (nums[i] + nums[j] == target){
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
//        We Reach Here if the Pair is Not Found
        System.out.println("Pair Not Found");
    }
}
