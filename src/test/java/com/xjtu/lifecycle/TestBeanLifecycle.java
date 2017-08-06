package com.xjtu.lifecycle;

import com.xjtu.base.UnitTestBase;
import com.xjtu.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by 18710 on 2017/7/31.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase{

    public TestBeanLifecycle() {
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void testBeanLifecycle() {
        super.getBean("beanLifecycle");
    }

}
