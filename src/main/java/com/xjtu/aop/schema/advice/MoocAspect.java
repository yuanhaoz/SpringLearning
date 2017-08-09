package com.xjtu.aop.schema.advice;

/**
 * 切面程序
 * Created by 18710 on 2017/8/8.
 */
public class MoocAspect {

    public void before() {
        System.out.println("MoocAspect before...");
    }

    public void afterReturning() {
        System.out.println("MoocAspect after returning...");
    }

    public void afterThrowing() {
        System.out.println("MoocAspect after throwing...");
    }

    public void after() {
        System.out.println("MoocAspect after...");
    }

}
