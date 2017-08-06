package com.xjtu.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by 18710 on 2017/8/6.
 */
public class BeanLifecycle
//    实现接口来初始化或者销毁Bean对象
        implements InitializingBean, DisposableBean
{

    //    // init_method初始化方法
    public void defaultInit() {
        System.out.println("defaultInit start...");
    }

    // destory_method销毁方法
    public void defaultDestory() {
        System.out.println("defaultDestory destory...");
    }

    // 接口销毁对象方法
    public void destroy() throws Exception {
        System.out.println("BeanLifecycle destroy...");
    }

    // 接口初始化对象方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifecycle afterPropertiesSet...");
    }

    // init_method初始化方法
    public void start() {
        System.out.println("BeanLifecycle start...");
    }

    // destory_method销毁方法
    public void destory() {
        System.out.println("BeanLifecycle destory...");
    }

}
