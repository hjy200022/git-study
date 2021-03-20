package com.hjy.edu.hdu.算法.数组系列;

/*
    不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 */

import java.util.Arrays;

public class Pass_原地删除 {
    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                //核心代码
                nums[length] = nums[i];
                length+= 1;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
