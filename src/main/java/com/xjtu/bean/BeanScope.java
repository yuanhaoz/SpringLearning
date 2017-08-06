package com.xjtu.bean;

/**
 * 测试作用域的内容
 * Created by 18710 on 2017/8/6.
 */
public class BeanScope {

    public void say() {
        System.out.println("BeanScope say: " + this.hashCode());
    }

}
