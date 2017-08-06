package com.xjtu.ioc.injection.dao;

/**
 * Created by 18710 on 2017/7/31.
 */
public class InjectionDaoImpl implements InjectionDao   {

    public void save(String arg) {
        // 模拟数据库保存数据
        System.out.println("保存数据：" + arg);
    }
}
