package com.hjy.edu.hdu.算法.数组系列;

// 题目描述：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

public class _3_无重复字符的字符串 {
    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        int res = 0;
        int start = 0; // 窗口开始位置

        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            // 核心代码！真的很难自己想出来
            start = Math.max(start, last[index]);
            res = Math.max(res, i - start + 1);
            last[index] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "ssyn,nb";
        System.out.println(_3_无重复字符的字符串.lengthOfLongestSubstring(s));
    }
}
