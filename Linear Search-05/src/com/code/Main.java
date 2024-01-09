package com.code;

// search in the array
public class Main {
    public static void main(String[] args) {
        int[] nums = {22, 13, 21, 42, 32, 0, -1, 4352, 32, 3};
        int target = 32;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // if item is found return the index, otherwise return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // if none of this happene
        return -1;
    }
}
