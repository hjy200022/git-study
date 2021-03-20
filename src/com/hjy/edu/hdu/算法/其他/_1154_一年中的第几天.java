package com.hjy.edu.hdu.算法.其他;

public class _1154_一年中的第几天 {
    public int dayOfYear(String date) {
        int res = 0,mouth = 0, day = 0,year = 0;
        int[][] data = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };
        /**
         * ① public String substring(int beginIndex)
         *
         * 这个方法截取的字符串是从索引beginIndex开始的，到整个字符串的末尾，例如：字符串String s = "abcdef";
         *
         * 调用s.substring(2)表示从字符串的索引2开始截取到整个字符串结束，截取的字符串为cdef
         *
         * ② public String substring(int beginIndex, int endIndex)
         *
         * 这个方法截取的字符串从beginIndex开始，到字符串索引的endIndex - 1结束，即截取的字符串不包括endIndex这个索引对应的字符，所以endIndex的最大值为整个字符串的长度，所以使用这个方法的时候需要特别注意容易发生字符串截取越界的问题
         * ————————————————
         */
        year = Integer.parseInt(date.substring(0,4));
        mouth = Integer.parseInt(date.substring(5,7));
        day = Integer.parseInt(date.substring(8,10));

        //1、能被4整除，但不能被100整除； 2、能被400整除；
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            for (int i = 0; i < mouth - 1; i++){
                res += data[1][i];
            }
        } else {
            for (int i = 0; i < mouth - 1; i++){
                res += data[0][i];
            }
        }
        return res + day;
    }
}
