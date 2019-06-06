package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.Mengniu;
import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Telunsu;
import com.gupaoedu.vip.pattern.factory.Yili;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-16 11:09
 **/
public class MilkFactory  extends AbstractFactory{
    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
