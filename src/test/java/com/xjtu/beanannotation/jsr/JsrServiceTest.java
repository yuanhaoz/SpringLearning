package com.xjtu.beanannotation.jsr;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 18710 on 2017/8/7.
 */
public class JsrServiceTest extends UnitTestBase{

    public JsrServiceTest() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void test(){
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }

}