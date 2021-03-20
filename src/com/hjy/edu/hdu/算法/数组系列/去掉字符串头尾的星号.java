package com.hjy.edu.hdu.算法.数组系列;

public class 去掉字符串头尾的星号 {
    public static String trimStar(String srcString) {
        int left = 0;
        int right = 0;
        int arrayLength = srcString.length();
        char[] nums = srcString.toCharArray();  //字符串 => 字符型数组

        for (int i = 0; i < arrayLength; i++){
            if( nums[i] != '*' ) {
                left = i;
                break;
            }
        }
        for (int i = arrayLength - 1; i >= 0; i--){
            if( nums[i] != '*' ){
                right = i;
                break;
            }
        }
        char[] nums2 = new char[right-left+1];
        int j = 0;
        for (int i = left; i <= right; i++){
            nums2[j] = nums[i];
            j++;
        }
        String result = String.copyValueOf(nums2);  //字符型数组 => 字符串
        return result;
    }

    public static void main(String[] args) {
        String srcString = "*****a**bc***";
        System.out.println(trimStar(srcString));
        srcString.trim();
    }
}
