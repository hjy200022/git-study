package com.hjy.edu.hdu.算法.数组系列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5701_执行一次字符串交换能否使两个字符串相等 {
    public static boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)){
                return true;
            }
            int n = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i) != s2.charAt(i)) {
                    n++;
                }
                list.add(i);
            }
            if (n == 2){
                int a = list.get(0);
                int b = list.get(1);
                if(s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a)){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        String s1 = "aa",s2 = "bb";
        System.out.println(areAlmostEqual(s1,s2));
    }
}
