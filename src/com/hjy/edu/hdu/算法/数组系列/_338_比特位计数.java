package com.hjy.edu.hdu.算法.数组系列;

/*
    题目要求：给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 */

import java.util.Arrays;

public class _338_比特位计数 {
    public static int[] countBits(int num) {
        int[] a = new int[num + 1];
        int result = 0;
        for (int i = 0; i <= num; i++){
            int j = i;
            while ( j != 0 ){
                if (j % 2 == 1){
                    result++;
                }
                j = j / 2;
            }
            a[i] = result;   //结果存入数组
            result = 0;      //计数器置零
        }
        return a;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(Arrays.toString(countBits(num)));
    }
}
