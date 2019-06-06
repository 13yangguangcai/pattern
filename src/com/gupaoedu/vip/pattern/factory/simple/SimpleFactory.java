package com.gupaoedu.vip.pattern.factory.simple;

import com.gupaoedu.vip.pattern.factory.Mengniu;
import com.gupaoedu.vip.pattern.factory.Milk;
import com.gupaoedu.vip.pattern.factory.Telunsu;
import com.gupaoedu.vip.pattern.factory.Yili;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-16 10:25
 **/
public class SimpleFactory {
    public Milk getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new Telunsu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        } else if ("蒙牛".equals(name)) {
            return new Mengniu();
        }else {
            System.out.println("不能生产您所需的产品");
            return null;
        }
    }
}
