package com.gupaoedu.vip.pattern.factory.func;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-16 10:56
 **/
public class FactoryTest {
    public static void main(String[] args) {
//        货比三家，不知道谁好谁坏
//        配置，可能会出错

        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk());
    }
}
