package com.lixiaochi.ideatest.module01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


/*
1 执行(run) alt+r
2 提示补全 (Class Name Completion) alt+/
3 单行注释 ctrl + /
4 多行注释 ctrl + shift + /
5 向下复制一行 (Duplicate Lines) ctrl+alt+down(向下箭头)
6 删除一行或选中行 (delete line) ctrl+d
7 向下移动行(move statement down) alt+down
8 向上移动行(move statement up) alt+up
9 向下开始新的一行(start new line) shift+enter
10 向上开始新的一行 (Start New Line before current) ctrl+shift+enter
11 如何查看源码 (class) ctrl + 选中指定的结构 或 ctrl + shift + t
12 万能解错/生成返回值变量 alt + enter
13 退回到前一个编辑的页面 (back) alt + left
14 进入到下一个编辑的页面(针对于上条) (forward) alt + right
15 查看继承关系(type hierarchy) F4
* */
public class Customer {
    private static final int WO_SHI_CHANG_LIANG=1;
    private ArrayList<String> arrayList;

    public static void main(String[] args)  {
        System.out.println("输出Hello World！！！");

        ArrayList<String> arrayList = new ArrayList<>();

        Date date = new Date();


        test1();
    }


    public static String test1() {
        try {
            FileInputStream input = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("show method separators 显示方法分割符,进行方法的区分");
        return "我是李小池";
    }
}
