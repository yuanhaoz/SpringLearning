package com.xjtu.aop.schema.advice.biz;

import com.xjtu.aop.schema.advice.MoocAspect;
import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 测试切面程序AOP
 * Created by 18710 on 2017/8/8.
 */
public class AspectBizTest extends UnitTestBase {

    public AspectBizTest() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void biz() throws Exception {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.biz();
    }

}