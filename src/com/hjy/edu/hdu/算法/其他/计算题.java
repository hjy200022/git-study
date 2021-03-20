package com.hjy.edu.hdu.算法.其他;
/*
   计算多少年后中国人口从13亿增长到20亿，增长率固定为1%。
 */
public class 计算题 {
    public static final double GROWTH_RATE = 1.01;
    public static int population(){
        int year = 0;
        double now = 13.0;
        double future = 20.0;
        double over_future = 0;
        while(over_future < future){
            over_future = now * Math.pow(1.01,year);
            year++;
        }
        return year-1;
    }

    public static void main(String[] args) {
        System.out.println(population());
    }
}
