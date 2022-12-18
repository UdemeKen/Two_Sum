package org.example;

public class Main {
    public static void main(String[] args) {
        BrutForceApproach brutForceApproach = new BrutForceApproach();
        brutForceApproach.findPair(new int[]{8, 7, 2, 5, 3, 1},10);

        SortingApproach sortingApproach = new SortingApproach();
        sortingApproach.findPair(new int[]{8, 7, 2, 5, 3, 1},10);

        HashingApproach hashingApproach = new HashingApproach();
        hashingApproach.findPair(new int[]{8, 7, 2, 5, 3, 1},10);
    }
}