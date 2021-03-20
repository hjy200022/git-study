package com.hjy.edu.hdu;
/*
*  StringJoiner
*
*  StringBuffer  线程安全
*
*  StringBuilder 线程不安全
*
* */
public class StringJoiner {
    private static String a = "那没事了";
    public static void main(String[] args) {
        //StringJoiner
        java.util.StringJoiner stringJoiner1 = new java.util.StringJoiner(",","[","]");
        String str1;
        stringJoiner1.add(StringJoiner.a);
        stringJoiner1.add("????");
        str1 = stringJoiner1.toString();
        System.out.println(str1);

        java.util.StringJoiner stringJoiner2 = new java.util.StringJoiner(",","[","]").add(a).add("???").add(stringJoiner1.toString());
        System.out.println(stringJoiner2.toString());

        System.out.println(stringJoiner2.length());

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("陈润GKD,");
        stringBuffer.append(stringJoiner1).append(stringJoiner2);
        System.out.println(stringBuffer);
    }
}

