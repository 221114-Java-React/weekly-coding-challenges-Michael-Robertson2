package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        int target = k+1;

            LOOP:
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    target++;
                    break LOOP;
                }
            }
            return target;
    }
}
