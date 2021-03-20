package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class 加一 {
    public static int[] plusOne(int[] digits) {
//        if(digits[digits.length-1] == 9){
//            int[] digits_copy = new int[digits.length + 1];
//            for(int i = 0; i < digits.length; i++){
//                digits_copy[i] = digits[i];
//            }
//            digits_copy[digits.length - 1] = 1;
//            digits_copy[digits.length] = 0;
//            return digits_copy;
//        }else {
//            digits[digits.length-1] = digits[digits.length-1] + 1 ;
//            return digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    public static void main(String[] args) {
        int[] digits = {4,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
