package com.xjtu.resource;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 18710 on 2017/8/6.
 */
public class MoocResourceTest extends UnitTestBase {

    public MoocResourceTest() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void resource() throws Exception {
        MoocResource moocResource = super.getBean("moocResource");
        moocResource.resource();
    }

}