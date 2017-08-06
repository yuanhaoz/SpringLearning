package com.xjtu.beanannotation;

import com.xjtu.base.UnitTestBase;
import com.xjtu.beanannotation.injection.service.InjectionServiceImpl;
import org.junit.Test;

/**
 * jdk1.8版本，会报错
 * Created by 18710 on 2017/8/6.
 */
public class BeanAnnotationTest extends UnitTestBase{

    public BeanAnnotationTest() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testSay() {
//        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        BeanAnnotation beanAnnotation = super.getBean("bean");
        beanAnnotation.say("hello");
    }

    @Test
    public void testMyHashCode() {
        BeanAnnotation beanAnnotation = super.getBean("bean");
        beanAnnotation.muHashCode();

        BeanAnnotation beanAnnotation2 = super.getBean("bean");
        beanAnnotation2.muHashCode();
    }

    @Test
    public void testInjection() {
        InjectionServiceImpl injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("你好");
    }

}