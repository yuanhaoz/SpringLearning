package com.xjtu.ioc.interfaces;

import com.xjtu.base.UnitTestBase;
import com.xjtu.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by 18710 on 2017/7/31.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{

    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSetter() {

        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("这是要保存的数据");
    }

}
