package com.yangshuo.arithmetic;

/**
 * 二分查找算法之JAVA实现
 * 1、算法概念。
 * 二分查找算法也称为折半搜索、二分搜索，
 * 是一种在有序数组中查找某一特定元素的搜索算法。
 * 请注意这种算法是建立在有序数组基础上的。
 * 2、算法思想。
 * ①搜素过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜素过程结束；
 * ②如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，
 * 而且跟开始一样从中间元素开始比较。
 * ③如果在某一步骤数组为空，则代表找不到。
 * 这种搜索算法每一次比较都使搜索范围缩小一半。
 *
 * 3、实现思路。
 *
 * ①找出位于数组中间的值，并存放在一个变量中（为了下面的说明，变量暂时命名为temp）；
 * ②需要找到的key和temp进行比较；
 * ③如果key值大于temp，则把数组中间位置作为下一次计算的起点；重复① ②。
 * ④如果key值小于temp，则把数组中间位置作为下一次计算的终点；重复① ② ③。
 * ⑤如果key值等于temp，则返回数组下标，完成查找。
 */
public class BinarySerach {
    /**
     * @param <E>
     * @param array 需要查找的有序数组
     * @param from 起始下标
     * @param to 终止下标
     * @param key 需要查找的关键字
     * @return
     * @throws Exception
     */
    public static <E extends Comparable<E>> int binarySearch(E[] array, int from, int to, E key) throws Exception {
        if (from < 0 || to < 0) {
            throw new IllegalArgumentException("params from & length must larger than 0 .");
        }
        if (from <= to) {
            int middle = (from >>> 1) + (to >>> 1); // 右移即除2
            E temp = array[middle];
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
