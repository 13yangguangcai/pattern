package com.gupaoedu.vip.pattern.singleton.hungry;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-17 08:52
 **/
public class Hungry {
    private Hungry(){};
//    先静态，后动态
//    先属性，后方法
//    先上后下
    private static final Hungry hungry=new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
