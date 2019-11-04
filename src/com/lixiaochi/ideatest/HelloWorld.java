package com.lixiaochi.ideatest;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //psvm   生成一个main方法
        //sout   快捷输出
        System.out.println();
        //soutp  将方法参数输出
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm  将当前方法名称输出
        System.out.println("HelloWorld.main");
        int num = 10;
        //soutv  将前一个变量的值进行输出
        System.out.println("num = " + num);

        //fori   生成一个
        System.out.println();
        int[] arrays = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            
        }
        for (int array : arrays) {
            
        }
        int[] arrays1 = new int[100];
        for (int i : arrays1) {
            System.out.println(arrays);
        }

        ArrayList<String> list = new ArrayList<>();

    }

    public void test(int num1 , int index) {
        System.out.println("num1 = " + num1 + ", index = " + index);
        System.out.println("HelloWorld.test");

    }
}
