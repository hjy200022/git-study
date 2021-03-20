package com.hjy.edu.hdu.算法.数组系列;

public class _303_区域和检索 {
    public int[] nums;
    //构造函数初始化对象
    public _303_区域和检索(int[] nums) {
        this.nums = nums;
        System.out.println("数组存入成功，初始化构造函数完毕");
    }
    //实现功能的函数
    public int sumRange(int i, int j) {
        int value = 0;
        while ( i != j ){
            value += nums[i];
            i++;
        }
        value += nums[j];
        System.out.println("return "+ value);
        return value;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 0, 3, -5, 2, -1};
        _303_区域和检索 numArray = new _303_区域和检索(nums1);
        numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
        numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
        numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
    }
}

