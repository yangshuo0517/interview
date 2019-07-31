package com.yangshuo.arithmetic;

import java.util.Arrays;

/**
 * 快速排序
 * <p>
 * 1、算法概念。
 * 快速排序（Quicksort）是对冒泡排序的一种改进。由C. A. R. Hoare在1962年提出。
 * 2、算法思想。
 * 通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，
 * 以此达到整个数据变成有序序列。
 * <p>
 * 3、实现思路。
 * ①以第一个关键字 K 1 为控制字，将 [K 1 ,K 2 ,…,K n ] 分成两个子区，
 * 使左区所有关键字小于等于 K 1 ，右区所有关键字大于等于 K 1 ，
 * 最后控制字居两个子区中间的适当位置。在子区内数据尚处于无序状态。
 * ②把左区作为一个整体，用①的步骤进行处理，右区进行相同的处理。（即递归）
 * ③重复第①、②步，直到左区处理完毕。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 2, 3, 5, 78, 6, 21, 99, 88};
        int len = numbers.length;
        //如果数组大于2的时候才开始排序
        if (len > 1) {
            quickSort(numbers, 0, len - 1);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            quickSort(list, low, middle - 1);
            quickSort(list, middle + 1, high);
        }
    }

    public static int getMiddle(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && temp <= arr[high]) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high];
                low++;
            }
            while (low < high && arr[low] <= temp) {
                low++;
            }
            if (low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        arr[low] = temp;
        return low;
    }
}
