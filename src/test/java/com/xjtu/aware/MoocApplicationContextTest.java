package com.xjtu.aware;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by 18710 on 2017/8/6.
 */
public class MoocApplicationContextTest extends UnitTestBase{

    public MoocApplicationContextTest() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void setApplicationContext() throws Exception {
        // 依赖注入得到bean对象，判断bean对象的hashcode()是否和原来的一致
        MoocApplicationContext moocApplicationContext = super.getBean("moocApplicationContext");
        System.out.println("MoocApplicationContext : " + moocApplicationContext.hashCode());
    }

}