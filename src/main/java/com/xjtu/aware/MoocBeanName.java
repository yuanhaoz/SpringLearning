package com.xjtu.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * Created by 18710 on 2017/8/6.
 */
public class MoocBeanName implements BeanNameAware, ApplicationContextAware{
    private String beanName;

    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("MoocBeanName1 : " + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MoocBeanName2 : " + applicationContext.getBean(this.beanName).hashCode());
    }
}
