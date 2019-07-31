package com.yangshuo.arithmetic;

import java.util.Arrays;

/**
 * 直接选择排序
 */
public class XuanZe {

    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 9, 5, 7, 3, 8, 2, 5, 1};
        xuanZe(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void xuanZe(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}