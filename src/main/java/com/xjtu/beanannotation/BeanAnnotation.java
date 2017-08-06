package com.xjtu.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by 18710 on 2017/8/6.
 */
//@Component
@Component("bean")
//@Scope("prototype") // 原型模式
@Scope("singleton") // 单例模式
public class BeanAnnotation {

    public void say(String word) {
        System.out.println("BeanAnnotation : " + word);
    }

    public void muHashCode() {
        System.out.println("my hashCode : " + this.hashCode());
    }

}
