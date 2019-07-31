package com.yangshuo.test;

/**
 * 懒汉式（解决了线程安全问题的）
 */
public class Bank02 {

    private static Bank02 bank = null;

    private Bank02() {
    }

    public static Bank02 getInstance() {

        /*
         * 在外面加一层判断可以提高懒汉式单例模式的效率
         *   原因：如果不加这一层锁，后续线程进来都要先等待锁，然后在判断是否为空
         *           如果我们加了这一层锁之后，后续线程进来直接判断对象没空就不用再等待锁了
         *           省去了后续线程等待锁而消耗的时间，提高了执行效率
         */
        if (bank == null) {

            synchronized (Bank02.class) {
                if (bank == null) {
                    bank = new Bank02();
                }
            }
        }
        return bank;
    }

}
