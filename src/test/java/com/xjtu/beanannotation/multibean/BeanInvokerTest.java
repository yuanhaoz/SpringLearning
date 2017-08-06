package com.xjtu.beanannotation.multibean;

import com.xjtu.base.UnitTestBase;
import com.xjtu.beanannotation.BeanAnnotationTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by 18710 on 2017/8/6.
 */
public class BeanInvokerTest extends UnitTestBase {

    public BeanInvokerTest() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void getList() throws Exception {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.getList();
    }

    @Test
    public void getMap() throws Exception {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.getMap();
    }

}