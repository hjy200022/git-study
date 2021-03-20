package com.hjy.edu.hdu.算法.其他;

import java.math.BigInteger;
/*
    互质,若N个整数的最大公因数是1，则称这N个整数互质。
    例如8,10的最大公因数是2，不是1，因此不是整数互质。
    7,11,13的最大公因数是1，因此这是整数互质。
*/

public class 辗转取余法_判断是否互质 {
    public static void Remainder(long m,long n){
        long r = 0L;
        while (n != 0){
            r = m % n;
            m = n;
            n = r;
        }
        if (m == 1) {
            System.out.println("互质");
        } else {
            System.out.println("不互质");
        }
    }

    public static void main(String[] args) {
        long m = 12345678910L;
        long n = 9999999999L;
        Remainder(m, n);
    }
}
