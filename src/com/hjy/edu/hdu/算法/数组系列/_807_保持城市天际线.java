package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;

public class _807_保持城市天际线 {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        int[] up_down = new int[grid.length];
        int[] left_right = new int[grid[0].length];
        //up_down 上下来看的高度
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length;j++){
                if(grid[i][j] > up_down[i]){
                    up_down[i] = grid[i][j];
                }
            }
        }
        //left_right 左右来看的高度
        for (int j = 0; j < grid[0].length;j++){
            for (int i = 0; i < grid.length; i++){
                if(grid[i][j] > left_right[j]){
                    left_right[j] = grid[i][j];
                }
            }
        }
        System.out.println("上下"+ Arrays.toString(up_down) +  " 左右" + Arrays.toString(left_right));
        //取不掩盖最高城市的 最小差值
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length;j++){
                res += Math.min(up_down[i] - grid[i][j],left_right[j] - grid[i][j]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = { {3,0},{2,4},{9,2} };
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}
