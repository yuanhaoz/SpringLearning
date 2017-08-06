package com.xjtu.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by 18710 on 2017/7/31.
 */
@Repository
public class InjectionDaoImpl implements InjectionDao {

    public void save(String arg) {
        // 模拟数据库保存数据
        System.out.println("保存数据：" + arg);
    }
}
