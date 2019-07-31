package com.yangshuo.exer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Serach2D
 * Description:
 * date: 2018/12/7 16:56
 *
 * @author ys
 * @since JDK 1.8
 */
public class Serach2D {

    public static  int binarySearch(String[] array, int from, int to, String key) throws Exception {
        if (from < 0 || to < 0) {
            throw new IllegalArgumentException("params from & length must larger than 0 .");
        }
        if (from <= to) {
            int middle = (from >>> 1) + (to >>> 1); // 右移即除2
            String temp = array[middle];
            if (temp.compareTo(key) > 0) {
                to = middle - 1;
            } else if (temp.compareTo(key) < 0) {
                from = middle + 1;
            } else {
                return middle;
            }
        }
        return binarySearch(array, from, to, key);
    }
}
