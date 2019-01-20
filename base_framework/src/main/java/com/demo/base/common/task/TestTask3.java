package com.demo.base.common.task;

import org.springframework.stereotype.Component;

/**
 * @author Chen
 * @created 2019-01-20-11:28.
 */
@Component
public class TestTask3 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + "this is scheduler task runing  " + (count++));
    }
}
