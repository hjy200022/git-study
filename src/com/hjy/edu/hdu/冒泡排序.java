package com.hjy.edu.hdu;

import java.util.Scanner;

//冒泡排序 升序
public class 冒泡排序 {
    public 冒泡排序(){
        Scanner input = new Scanner(System.in);
        int[] sort = new int[10];
        int temp;
        for(int i =0; i < sort.length; i++){
            sort[i] = input.nextInt();
        }
        for(int i = 0; i < sort.length - 1; i++){
            for(int j = 0; j < sort.length - 1 - i; j++){
                if(sort[j] < sort[j+1]){
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序的结果为：");
        for (int i = 0; i < sort.length; i++){
            System.out.print(sort[i] + " , ");
        }
    }

    public static void main(String[] args) {
        冒泡排序 sort = new 冒泡排序();
    }
}
