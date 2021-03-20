package com.hjy.edu.hdu.算法.其他;

//要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

public class 求1加2加n_有各种条件限制 {
    //思想：递归 + 判负
    public static int sumNums(int n) {
        int nums = n;
        boolean flag = n > 0 && (nums += sumNums(n-1)) > 0;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(9));
    }
}
