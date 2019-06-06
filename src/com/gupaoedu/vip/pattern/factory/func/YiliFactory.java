package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Yili;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-16 11:00
 **/
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
