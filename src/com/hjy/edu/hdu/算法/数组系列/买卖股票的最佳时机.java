package com.hjy.edu.hdu.算法.数组系列;

public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int profits = 0;
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0; // 初始化为0  相等于卖出
        dp[0][1] = -prices[0];   // 相等于买入

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);  // 此时的卖出值等于上一次的卖出后的值与当前进行卖出操作后的值 比较，取最大
            dp[i][1] = Math.max(dp[i-1][0] - prices[i], dp[i-1][1]); // 当前买入操作后的值等于 上一次买入后手里的值与 进行买入操作后剩余的值比较，取最大
        }

        profits = dp[prices.length - 1][0];  // 相当于卖出操作后手里的钱
        return profits;
    }
}
