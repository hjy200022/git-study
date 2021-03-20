package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class Pass_两个数组的交集 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i, j, k;
        i = j = k = 0;
        Arrays.sort(nums1);  // Array.sort升序排序
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                nums1[k] = nums1[i]; //核心
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOf(nums1, k); //形成新的数组，数组最大数量为k个
    }
    public static void main(String[] args) {
        int[] nums1 = {2,4,4,4,2,3,6,10};
        int[] nums2 = {4,4,3,1,1};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));  // 打印数组需要toString后再sout打印
    }
}

