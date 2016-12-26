package com.other;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-12-23-16:28.
 */
public class Test {
    public static void main(String[] args) {
        AtomicInteger STUB_SEQ = new AtomicInteger();

        for (int i = 0; i < 150000; i++) {
            int index = STUB_SEQ.getAndIncrement() & 131071;

            System.out.println(index);
        }
    }
}
