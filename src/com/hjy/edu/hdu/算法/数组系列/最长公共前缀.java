package com.hjy.edu.hdu.算法.数组系列;

import java.util.Arrays;
import java.util.Scanner;

public class 最长公共前缀 {
    public static String longestPubPre(String[] strings){
        if(strings == null || strings.length == 0){
            return "";
        }
        String template = strings[0];
        int i = template.length(), j = 1;
        while(i > 0 && j <= strings.length - 1){
            String str = template.substring(0,i);
            if(strings[j].startsWith(str)){
                j++;
            }else {
                j = 1;
                i--;
            }
        }
        return j == strings.length ? template.substring(0, i) : "";
    }

    public static void main(String[] args) {
//        String[] y ={"flower","flow","flight"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = scanner.nextInt();
        scanner.nextLine();  //加一个nextLine()读取换行符，并不做处理。
        String[] y = new String[x];
        for(int i = 0; i < x; i++){
            System.out.println("请输入一个字符串");
            y[i] = scanner.nextLine();
        }
        System.out.println("输出最长公共前缀");
        System.out.println(longestPubPre(y));
    }
}
