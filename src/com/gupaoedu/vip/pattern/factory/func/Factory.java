package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description 工厂模型
 * @author: 杨光彩
 * @create: 2019-04-16 10:54
 **/
public interface Factory {
//    工厂必然具有生产产品技能，统一的产品出口
    Milk getMilk();
}
