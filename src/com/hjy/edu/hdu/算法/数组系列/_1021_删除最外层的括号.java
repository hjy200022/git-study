package com.hjy.edu.hdu.算法.数组系列;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class _1021_删除最外层的括号 {
    public static String removeOuterParentheses(String s) {
        int left = 0, right = 0, index = 0;
        char[] nums = s.toCharArray();

        //使用StringBuilder.append()合并， 不需要用list.add()
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '(') {
                left++;
            } else {
                right++;
            }
//            System.out.println(left);
            if (left == right && left != 1) {
                for (int j = index + 1; j < i; j++) {
                    res.append(nums[j]);
                }
                index = i + 1;
                left = 0;
                right = 0;
            }else if (left == 1 && right == 1){
                index = i + 1;
                left = 0;
                right = 0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "()()()()(())";
//        String s = "(()())";
        System.out.println(removeOuterParentheses(s));
    }
}
