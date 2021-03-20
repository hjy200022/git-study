package com.hjy.edu.hdu.算法.递归;

/**
 * 题目描述
 * 一个有n级台阶，一次可以走1个，2个 或者 3个，问走完n级台阶有多少种走法
 */
public class 走台阶_力扣是动态规划 {
    public static int solution(int n){
        if (n < 0){
            return 0;
        } else if (n == 0){
            return 1;
        } else {
            return solution(n - 1) + solution(n - 2) + solution(n - 3);
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
        //结果7种
    }
}
