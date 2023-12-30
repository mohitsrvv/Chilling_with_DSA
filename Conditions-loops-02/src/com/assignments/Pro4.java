package com.assignments;

// LEETCODE => https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class Pro4 {
    class Solution {
        public int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;
            while(n > 0){
                int right = n % 10;
                product *= right;
                sum += right;
                n /= 10;
            }
            return product - sum;
        }
    }
}
