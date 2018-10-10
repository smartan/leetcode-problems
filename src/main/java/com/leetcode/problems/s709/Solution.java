package com.leetcode.problems.s709;

/**
 * @author yinliang
 * @version 1.0
 * @date 2018/10/9 15:35
 */

/*
 * 转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

    示例 1：
        输入: "Hello"
        输出: "hello"

    示例 2：
        输入: "here"
        输出: "here"

    示例 3：
        输入: "LOVELY"
        输出: "lovely"
 */
class Solution {
    public String toLowerCase(String str) {
        // A~Z 65~90
        // a~z 97~122
        String lowerStr = "";
        for (char c : str.toCharArray()) {
            if (c < 65 || c > 90) {
                lowerStr = lowerStr + String.valueOf(c);
                continue;
            }
            char newChar = (char) (c + 32);

            lowerStr = lowerStr + String.valueOf(newChar);
        }
        return lowerStr;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("Hello"));
        System.out.println(new Solution().toLowerCase("here"));
        System.out.println(new Solution().toLowerCase("LOVELY"));
    }
}

