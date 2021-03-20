package com.hjy.edu.hdu.算法.递归;

public class 用递归实现字符串倒转 {
    public static String reverse(String originStr){
        if (originStr == null || originStr.length() == 1){
            return originStr;
        }
        //substring(1)代表 从字符串的索引2开始截取到整个字符串结束，第一遍截取的字符串为 ello
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
