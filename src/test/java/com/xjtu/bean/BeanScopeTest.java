package com.xjtu.bean;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by 18710 on 2017/8/6.
 */
public class BeanScopeTest extends UnitTestBase{

    public BeanScopeTest() {
        super("classpath:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }

}
