package com;

// byte、int 与 二进制 互转，先将byte的127、128、-127、-128转二进制，再将这些二进制转int
// 阅读Integer内部类IntegerCache的源码
// 写个工具类，实现类型转换，String 转 (int、long、float、double、byte[])，(byte[]、int) 转 String
// 写个工具类，实现ASCII和char互转
// 写个工具类，实现二进制、十进制、十六进制互转

import tool.AsciiChar;
import tool.Number2String;
import tool.NumberTransform;
import tool.String2Number;

public class Main
{
    public static void main(String[] args)
    {
        byte b1 = 127;
        byte b2 = (byte)128;
        byte b3 = -127;
        byte b4 = -128;

        // 1111111
        String bin1 = byte2Bin(b1);

        // 11111111111111111111111110000000
        String bin2 = byte2Bin(b2);

        // 11111111111111111111111110000001
        String bin3 = byte2Bin(b3);

        // 11111111111111111111111110000000
        String bin4 = byte2Bin(b4);

        // 127
        bin2long(bin1);
        bin2long(bin2);
        bin2long(bin3);
        bin2long(bin4);

        // [B@7c30a502
        byte[] b = String2Number.string2byte("hello world!");
        System.out.println(b);

        int i = String2Number.string2int("123");
        System.out.println(i);

        long l = String2Number.string2long("123456789123456789");
        System.out.println(l);

        float f = String2Number.string2float("123.456");
        System.out.println(f);

        double d = String2Number.string2double("123.456789456");
        System.out.println(d);

        String s1 = Number2String.byte2string(b);
        System.out.println(s1);

        String s2 = Number2String.int2string(i);
        System.out.println(s2);

        int a = AsciiChar.char2ascii('a');
        System.out.println(a);

        char c = AsciiChar.ascii2char(a);
        System.out.println(c);

        int dec = NumberTransform.bin2decimal(bin1);
        System.out.println(dec);

        String hex = NumberTransform.bin2hex(bin1);
        System.out.println(hex);

        String bin = NumberTransform.decimal2bin(127);
        System.out.println(bin);

        String hex2 = NumberTransform.decimal2hex(127);
        System.out.println(hex2);

        String bin5 = NumberTransform.hex2bin(hex2);
        System.out.println(bin5);

        int dec2 = NumberTransform.hex2decimal(hex2);
        System.out.println(dec2);
    }


    public static String byte2Bin(byte byteNum)
    {
        String bin = Integer.toBinaryString(byteNum);
        System.out.println(bin);
        return bin;
    }


    public static long bin2long(String bin)
    {
        long i = Long.parseLong(bin, 2);
        System.out.println(i);
        return i;
    }

}
