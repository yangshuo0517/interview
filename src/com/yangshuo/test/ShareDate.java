package com.yangshuo.test;

class ShareDate {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {

        while (number != 0) {
            this.wait();
        }
        ++number;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {

        while (number == 0) {
            this.wait();
        }
        --number;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
    }

}
