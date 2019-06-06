package com.gupaoedu.vip.pattern.factory.abstr;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-16 11:08
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();
//        对于用户而言，更加简单了
//        用户只有选择的权利了，保证了程序的健壮性
        System.out.println(factory.getMengniu());
    }
}
