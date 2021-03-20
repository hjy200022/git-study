package com.hjy.edu.hdu.算法.数组系列;

public class _7_整数反转 {
    public static int reverse(int x) {
        int i = 0, y = x;
        int result = 0;
        while ( x!= 0){
            i++;
            x = x / 10;
        }
        int[] a = new int[i];
        for (int j = 0; j < i; j++){
            a[j] = y % 10;
            result = (int) (a[j] * Math.pow(10,i - j - 1) + result);
            y = y / 10;
        }
        if ( result >= 2147483647 || result <= -2147483648 ){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = -13132;
        System.out.println(reverse(x));
    }
}
