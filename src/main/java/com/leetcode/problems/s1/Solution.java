package com.leetcode.problems.s1;

/**
 * @author liang.yin
 * @version 1.0
 * @date 2018/10/10 10:09
 */

/*
 *  两数之和
 *  给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

    示例:
        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        boolean found = false;
        for(int i= 0; i< nums.length; i++){
            if(found){
                break;
            }
            int value = target - nums[i];
            result[0] = i;
            for(int j = i+1; j < nums.length; j++ ){
                if(value == nums[j]){
                    result[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return result;
    }
}

class TestTwoSum{
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = new Solution().twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}