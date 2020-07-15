package com.leetcode.problems.s9;

/**
 * @author smartan.yl
 * @version : Solution.java, v 0.1 2020年07月15日 14:43 smartan.yl Exp $
 */

/*
    判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

    示例 1:
    输入: 121
    输出: true

    示例 2:
    输入: -121
    输出: false
    解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

    示例 3:
    输入: 10
    输出: false
    解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String xStr = String.valueOf(x);
        for (int i = 0; i < xStr.length(); i++){
            if (xStr.charAt(i) != xStr.charAt(xStr.length() - i -1)){
                return false;
            }
            if (i >= xStr.length() /2){
                break;
            }
        }
        return true;
    }
}

class TestPalindromeNumber{
    public static void main(String[] args) {
        int x = 121;
        assert new Solution().isPalindrome(x);
        x = -121;
        assert !new Solution().isPalindrome(x);
        x = 10;
        assert !new Solution().isPalindrome(x);
    }
}
