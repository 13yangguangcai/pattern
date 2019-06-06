package com.gupaoedu.vip.pattern.factory.simple;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description 小作坊式的工厂模型
 * @author: 杨光彩
 * @create: 2019-04-16 09:45
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        为什么这里不能直接new milk呢？
//        下面的代码
//        这个new的过程实际上是一个比较复杂的过程，这里就是面向过程
//        有人民币就不需要自己new了，所以我接下来就使用工厂
//        System.out.println(new Telunsu().getName());



//        从小作坊式的生产方式
//        用户本身不再关心生产的过程，而只是关心这个结果
//        假如：特仑苏，伊利，蒙牛
//        成分配比都是不一样的
        SimpleFactory factory = new SimpleFactory();
//        把用户的需求告诉工厂
//        创建产品的过程隐藏了，对于用户而言完全不清楚是怎么产生的
        System.out.println(factory.getMilk("特仑苏"));
    }
}
