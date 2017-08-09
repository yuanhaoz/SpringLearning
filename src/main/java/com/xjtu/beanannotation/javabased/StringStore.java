package com.xjtu.beanannotation.javabased;

/**
 *
 * Created by 18710 on 2017/8/7.
 */
public class StringStore implements Store<String>{

    public void init() {
        System.out.println("StringStore init...");
    }

    public void destory() {
        System.out.println("StringStore destory...");
    }

}
