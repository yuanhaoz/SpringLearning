package com.xjtu.ioc.injection.service;

import com.xjtu.ioc.injection.dao.InjectionDao;

/**
 * Created by 18710 on 2017/7/31.
 */
public class InjectionServiceImpl implements InjectionService {

    // 需要 依赖注入（DI）的类
    private InjectionDao injectionDao;

    // 用于构造器注入使用
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

//    // 设置注入（设置get方法）
//    public void setInjectionDao(InjectionDao injectionDao) {
//        this.injectionDao = injectionDao;
//    }

    public void save(String arg) {
        // 模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDao.save(arg);
    }
}
