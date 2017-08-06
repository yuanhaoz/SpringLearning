package com.xjtu.autowiring;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 18710 on 2017/8/6.
 */
public class AutoWiringServiceTest extends UnitTestBase{

    public AutoWiringServiceTest() {
        super("classpath:spring-wiring.xml");
    }

    @Test
    public void say() throws Exception {
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("你好");
    }

}