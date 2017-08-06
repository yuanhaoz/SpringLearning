package com.xjtu.aware;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 18710 on 2017/8/6.
 */
public class MoocBeanNameTest extends UnitTestBase{

    public MoocBeanNameTest(){
        super("classpath:spring-aware.xml");
    }

    @Test
    public void setBeanName() throws Exception {
        System.out.println("MoocBeanName3 : " + super.getBean("moocBeanName").hashCode());
    }

}