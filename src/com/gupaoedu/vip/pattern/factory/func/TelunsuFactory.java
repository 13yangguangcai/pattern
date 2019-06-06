package com.gupaoedu.vip.pattern.factory.func;

import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Telunsu;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description 事情变得越来越专业
 * @author: 杨光彩
 * @create: 2019-04-16 10:58
 **/
public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
