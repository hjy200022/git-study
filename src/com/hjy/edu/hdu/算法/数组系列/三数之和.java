package com.hjy.edu.hdu.算法.数组系列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList res = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            if (nums[i] > 0) {
                break;
            }
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
