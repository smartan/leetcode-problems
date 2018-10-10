package com.leetcode.problems.s7;

/**
 * @author liang.yin
 * @version 1.0
 * @date 2018/10/10 10:32
 */

/*
    * 反转整数
    * 给定一个 32 位有符号整数，将整数中的数字进行反转。

    示例 1:
        输入: 123
        输出: 321

    示例 2:
        输入: -123
        输出: -321

    示例 3:
        输入: 120
        输出: 21

    注意:
        假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */

class Solution {
    public int reverse(int x) {
        String result = x < 0 ? "-" : "";

        String xStr = String.valueOf(x);

        for (int i = 0; i < xStr.length(); i ++){
            char c = xStr.charAt(xStr.length() - i -1);
            if(c == '-'){
                continue;
            }
            result = result + c;
        }

        long xLong = Long.parseLong(result);

        if(xLong > Integer.MAX_VALUE || xLong < Integer.MIN_VALUE){
            return 0;
        }
        return Integer.parseInt(result);
    }
}

class TestReverseInteger{
    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.reverse(123) == 321;
        assert solution.reverse(-123) == -321;
        assert solution.reverse(120) == 21;
        assert solution.reverse(1534236469) == 0;
        assert solution.reverse(-2147483648) == 0;
    }
}
