package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;
import java.util.Comparator;


public class _354_俄罗斯套娃信封问题_困难 {
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null){
            return 0;
        }
        // 问题在于怎么通过宽度进行排序了
        int[] tem;
        // 按宽度进行降序排列，如果宽度一致，则按高度降序排列
        for (int i = 0; i < envelopes.length;i++) {
            for (int j = i + 1; j < envelopes.length;j++){
                if (envelopes[i][0] > envelopes[j][0] || (envelopes[i][0] == envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) ){
                    tem = envelopes[i];
                    envelopes[i] = envelopes[j];
                    envelopes[j] = tem;
                }
            }
        }
//        Arrays.sort(envelopes,
//                new Comparator<int[]>() {
//                    @Override
//                    public int compare(int[] a, int[] b) {
//                        return a[0] == b[0] ? a[1] -b[1] : a[0] - b[0];
//                    }
//                }
//        );


//        for (int i = 0; i < envelopes.length; i++){
//            System.out.println(Arrays.toString(envelopes[i]));
//        }

        int[] dp = new int[envelopes.length];
        for(int i = 0; i < envelopes.length; i++){
            dp[i] = 1;
        }

        int result = 1;
        for(int i = 1; i < envelopes.length; i++) {
            int tmp = 1;
            for(int j = i-1; j >= 0; j--) {
                if(envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    tmp = Math.max(tmp, dp[j] + 1);
                }
            }
            dp[i] = tmp;
            result = Math.max(tmp, result);
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] envelopes = {{46, 89}, {50, 53}, {52, 68}, {72, 45},{77,81}};
        //输出: 3
        //解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
        System.out.println(maxEnvelopes(envelopes));
    }
}
