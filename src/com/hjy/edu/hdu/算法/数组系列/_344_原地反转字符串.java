package com.hjy.edu.hdu.算法.数组系列;

public class _344_原地反转字符串 {
    public void reverseString(char[] s) {
        char temp;
        for(int i = 0; i < s.length / 2; i++){
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
