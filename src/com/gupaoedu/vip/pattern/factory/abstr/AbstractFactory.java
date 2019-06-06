package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.Milk;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description 在spring中应用的最为广泛的一种设计模式
 * 易于扩展
 * @author: 杨光彩
 * @create: 2019-04-16 11:05
 **/
public abstract class AbstractFactory {

//    为什么要抽象？
//    把公共的逻辑放到一起，方便与管理
    /**
     * 获得一个蒙牛品牌的牛奶
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 获得一个伊利品牌的牛奶
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得一个特仑苏品牌的牛奶
     * @return
     */
    public abstract Milk getTelunsu();
}
