package com.xjtu.aop.schema.advice.biz;

/**
 * 需要添加切面处理的类
 * Created by 18710 on 2017/8/8.
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz...");
        throw new RuntimeException();
    }

}
