package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyTwo;

import java.util.concurrent.CountDownLatch;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-17 08:58
 **/
public class ThreadSafeTest {
    public static void main(String[] args) {
        int count = 200;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
//                    修改这里实现使用懒汉模式或者是饿汉模式
                    Object obj = LazyTwo.getInstance();
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                    try {
                        latch.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            latch.countDown();
        }

    }
}
