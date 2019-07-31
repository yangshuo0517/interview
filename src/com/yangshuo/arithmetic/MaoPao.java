package com.yangshuo.arithmetic;

import java.util.Arrays;

/**
 * 冒泡排序算法
 */
public class MaoPao {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 9, 5, 7, 3, 8, 2, 5, 1};
        maoPao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void maoPao(int[] arr) {

        boolean exchange;
        for (int i = 0; i < arr.length - 1; i++) {
            exchange = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    exchange = true;
                }
            }
            if(!exchange) return;
        }

    }

}
