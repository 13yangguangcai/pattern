package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-17 09:20
 **/
public class LazyTwo {
    private LazyTwo(){}
    private static LazyTwo Lazy=null;
    public static LazyTwo getInstance(){
        if(Lazy==null){
            Lazy=new LazyTwo();
        }
        return Lazy;
    }
}
