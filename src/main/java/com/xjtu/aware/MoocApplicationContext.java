package com.xjtu.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by 18710 on 2017/8/6.
 */
public class MoocApplicationContext implements ApplicationContextAware{

    // 通过上下文获取bean对象及其信息
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MoocApplicationContext : " +
                applicationContext.getBean("moocApplicationContext").hashCode());
    }

}
