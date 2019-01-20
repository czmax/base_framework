package com.demo.base.common.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chen
 * @created 2019-01-20-11:28.
 */
@Component
public class TestTask2 {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + "现在时间：" + dateFormat.format(new Date()));
    }
}

