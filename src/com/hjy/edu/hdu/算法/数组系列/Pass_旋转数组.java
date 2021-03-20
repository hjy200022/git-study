package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class Pass_旋转数组 {
    public static void rotate(int[] nums, int k) {
        int[] numsCopy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //核心代码
            numsCopy[(i + k) % nums.length] = nums[i];
        }
        //System.out.println(Arrays.toString(numsCopy));
        System.arraycopy(numsCopy, 0, nums, 0, nums.length);
    }

    //不合格的时间复杂度
//    public static int[] rotate(int[] nums,int k){
//        int number = nums.length;
//        int[] result = new int[number];
//
//        //将移动单位k调整
//        if(k > number){
//            k -= (k / number) * number;
//        }else if(k == number){
//            return nums;
//        }
//
//        for(int i = 0; i < k; i++){
//            for(int j = 0; j < number ; j++){
//                if(j != number - 1){
//                    result[j+1] = nums[j];
//                }else {
//                    result[0] = nums[j];
//                }
//            }
//            for(int j = 0; j < number ; j++){
//                nums[j] = result[j];
//            }
//        }
//
//        return nums;
//    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {-100,2,3,4,5,6,7,8,9,10,11,12};
        rotate(nums,k);
    }
}
