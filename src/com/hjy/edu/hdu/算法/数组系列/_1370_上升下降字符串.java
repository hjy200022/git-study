package com.hjy.edu.hdu.算法.数组系列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class _1370_上升下降字符串 {
    public static String sortString(String s) {
        //判空
        if (s.length() == 0) {
            return "";
        }
        //字母表 （可以省略）   (char)(i + 'a')
//        char[] eng = new char[]{'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //统计各个字母出现的次数
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++){
            nums[s.charAt(i) - 'a']++;
        }

        StringBuilder res = new StringBuilder();
        //标志数组Nums还有没有数字了
        int index = 1;
        /*
         *更好的方法，不用index，while条件是
         * 新生成的数组长度 < 输入字符串的长度时执行！！
         * 即： while ( res.length() < s.length() ){
         */
        while (index != 0){
            for (int i = 0; i < 26; i++ ){
                if (nums[i] > 0){
//                    res.append(eng[i]);
                    res.append((char)(i + 'a'));
                    nums[i]--;
                }
            }
            for (int j = 25; j >= 0; j-- ){
                if (nums[j] > 0){
//                    res.append(eng[j]);
                    res.append((char)(j + 'a'));
                    nums[j]--;
                }
            }
            for (int k = 25; k >= 0; k-- ){
                if (nums[k] > 0){
                    index = 1;
                    break;
                } else {
                    index = 0;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }
}
