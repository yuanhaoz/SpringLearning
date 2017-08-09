package com.xjtu.beanannotation.javabased;

import com.xjtu.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by 18710 on 2017/8/7.
 */
public class StoreConfigTest extends UnitTestBase {

    public StoreConfigTest() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void getStringStore() throws Exception {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void myDriverManager() throws Exception {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

    @Test
    public void getG() throws Exception {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

}