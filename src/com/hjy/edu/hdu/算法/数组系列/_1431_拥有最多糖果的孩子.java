package com.hjy.edu.hdu.算法.数组系列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _1431_拥有最多糖果的孩子 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>(); //重点
//        int[] copy = candies;   错误！！！引用复制，不是值的复制
        int n = candies.length;
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = candies[i];
        }

        for (int i = 0; i < n; i++){
            copy[i] += extraCandies;
            for (int j = 0; j < n; j++){
                if (copy[i] < candies[j]){
                    list.add(false); //重点
                    break;
                } else if (j == n -1){
                    list.add(true);
                }
            }
            System.out.println(Arrays.toString(new int[]{copy[i]}));
        }
        return list;
    }

}
