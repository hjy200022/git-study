package com.hjy.edu.hdu.算法.数组系列;

public class _304_二维区域和检索 {
    public int[][] matrix;
    public _304_二维区域和检索(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = 0, length = row2 - row1 + 1, high = col2 - col1 + 1;
        if (matrix == null){
            return 0;
        }
        for(int i = row1; i <=row2; i++){
            for(int j = col1; j <= col2; j++){
                result += matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,4},{1,2,4}};
        _304_二维区域和检索 sum = new _304_二维区域和检索( matrix);
        System.out.println(sum.sumRegion(0,0,1,1));
    }

}
