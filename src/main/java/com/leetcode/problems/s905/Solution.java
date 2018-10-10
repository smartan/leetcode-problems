package com.leetcode.problems.s905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yinliang
 * @version 1.0
 * @date 2018/10/9 16:05
 */

/*
 *  按奇偶校验排序数组
 *  给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。

    你可以返回满足此条件的任何数组作为答案。

    示例：
        输入：[3,1,2,4]
        输出：[2,4,3,1]
        输出：[4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。

    提示：
        1 <= A.length <= 5000
        0 <= A[i] <= 5000
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] a1 = new int[A.length];

        int i = 0;
        int j = 0;

        for (int a : A){
            if(a % 2 == 0){
                a1[i] = a;
                i ++;
                continue;
            }
            a1[A.length - j - 1] = a;
            j++;
        }
        return a1;
    }
}

class Test{
    public static void main(String[] args) {
        int[] A = new int[]{3,1,2,4};
        int[] a1 = new Solution().sortArrayByParity(A);
        for(int a : a1){
            System.out.print(a);
        }
    }
}