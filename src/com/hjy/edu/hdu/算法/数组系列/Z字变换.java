package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class Z字变换 {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        char[] chars = s.toCharArray();
        int len = chars.length;
        int period = numRows * 2 - 2;
        for (int i = 0; i < len; i++) {
            int mod = i % period;
            if (mod < numRows) {
                arr[mod] += chars[i];
            } else {
                arr[period - mod] += String.valueOf(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        for (String ch : arr) {
            res.append(ch);
        }
        return res.toString();
    }
}
