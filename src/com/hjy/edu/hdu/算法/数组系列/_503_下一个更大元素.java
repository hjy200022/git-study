package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class _503_下一个更大元素 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //判空
        if (nums == null) {
            return null;
        } else if (nums.length == 1) {
            result[0] = -1;
            return result;
        }

        // for + if 伞兵做法
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n + 1; j++){
                if ( j != n && nums[i] < nums[j]){
                    result[i] = nums[j];
                    System.out.println(i + ": flag = 1");
                    break;
                } else if(j == n){
                    //跳转到第一个元素，从第0个开始到i之间有无大于num[i]的数
                    for (int k = 0; k < i; k++){
                        if(nums[k] > nums[i]){
                            result[i] = nums[k];
                            System.out.println(i + ": xunhuan");
                            break;
                        }
                        if(k == i-1){
                            result[i] = -1;
                        }
                    }
                } else {
                    result[i] = -1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(result)));
    }
}
