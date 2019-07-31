package com.yangshuo.exer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

/**
 * ClassName: TestRandom
 * Description:
 * date: 2019/1/16 19:46
 *
 * @author YS
 * @since JDK 1.8
 */
public class TestRandom {

    private HashMap<Integer, Integer> map = new HashMap();

    @Test
    public void testRandomSeed() {
        Random random = new Random(2);

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(10);
            map.put(x, x);
            System.out.println(map.get(x));
        }

        System.out.println("==================================");

        Random random1 = new Random(2);
        for (int i = 0; i < 10; i++) {
            int y = random1.nextInt(10);
            System.out.println(map.get(y));
        }
    }
}
