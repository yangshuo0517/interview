package com.yangshuo.exer;

/**
 * ClassName: Anagram
 * Description:
 * date: 2018/12/14 17:35
 *
 * @author ys
 * @since JDK 1.8
 */
public class Anagram {

    public static void main(String[] args) {
        boolean anagram = isAnagram(" su ds a sad ad ", "ds su  a ad sad ");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String str1,String str2){

        if (str1.isEmpty() || str1 == null || str2.isEmpty() || str2 == null) {
            return false;
        }

        String str3 = str1.trim().replaceAll(" ", "").toLowerCase();
        String str4 = str2.trim().replaceAll(" ", "").toLowerCase();

        char[] chars1 = str3.toCharArray();

        for (int i = 0; i < chars1.length - 1; i++) {
            for (int j = 0; j < chars1.length - 1 - i; j++) {

                if (chars1[j] > chars1[j + 1]) {
                    char temp = chars1[j];
                    chars1[j] = chars1[j + 1];
                    chars1[j + 1] = temp;
                }
            }
        }

        char[] chars2 = str4.toCharArray();

        for (int i = 0; i < chars2.length - 1; i++) {
            for (int j = 0; j < chars2.length - 1 - i; j++) {

                if (chars2[j] > chars2[j + 1]) {
                    char temp = chars2[j];
                    chars2[j] = chars2[j + 1];
                    chars2[j + 1] = temp;
                }
            }
        }

        String s1 = new String(chars1);
        String s2 = new String(chars2);

        return s1.equals(s2);
    }
}
