package com.yangshuo.test;

/**
 * 饿汉式
 */
public class Blank01 {

    private static Blank01 blank = new Blank01();

    private Blank01() {}

    public static Blank01 getInstance() {
        return blank;
    }

}
