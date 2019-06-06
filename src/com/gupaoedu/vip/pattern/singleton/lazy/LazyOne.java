package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description
 * @author: 杨光彩
 * @create: 2019-04-17 09:20
 **/
public class LazyOne {
    private LazyOne(){}
    private static LazyOne Lazy=null;
    public static LazyOne getInstance(){
        if(Lazy==null){
            Lazy=new LazyOne();
        }
        return Lazy;
    }
}
