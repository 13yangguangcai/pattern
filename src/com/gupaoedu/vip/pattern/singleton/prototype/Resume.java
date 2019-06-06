package com.gupaoedu.vip.pattern.singleton.prototype;

/**
 * @program: gupaoedu-vip-pattern-factory
 * @description 简历类，也就是原型类
 * @author: 杨光彩
 * @create: 2019-06-06 20:17
 **/
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    public Resume(String name){
        this.name=name;
    }
//    设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
//    设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        this.timeArea=timeArea;
        this.company=company;
    }
//    显示
    public void Display(){
        System.out.println("name是{}，sex是{}，age是{}",name,sex,age);
        System.out.println("考试结束，更新模板状态失败，考试id{}，模板id{}", name, sex);
    }
}
