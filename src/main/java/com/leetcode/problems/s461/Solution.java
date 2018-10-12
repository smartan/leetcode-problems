package com.leetcode.problems.s461;

/**
 * @author liang.yin
 * @version 1.0
 * @date 2018/10/10 13:42
 */

/*
    * 汉明距离
    * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

    给出两个整数 x 和 y，计算它们之间的汉明距离。

    注意：
        0 ≤ x, y < 231.

    示例:
        输入: x = 1, y = 4
        输出: 2

    解释:
        1   (0 0 0 1)
        4   (0 1 0 0)
               ↑   ↑
        上面的箭头指出了对应二进制位不同的位置。
 */

class Solution {
    public int hammingDistance(int x, int y) {
        int num =0;

        for (int i = 31; i>= 0; i--){
            if((x >>> i & 1) == (y >>> i & 1)){
                continue;
            }
            num ++;
        }
        return num;
    }
}

class TestHammingDistance{
    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.hammingDistance(1, 4) == 2;
    }
}
