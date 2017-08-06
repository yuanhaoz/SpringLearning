package com.xjtu.beanannotation.injection.service;

import com.xjtu.beanannotation.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by 18710 on 2017/7/31.
 */
@Service
public class InjectionServiceImpl implements InjectionService {

    @Autowired
    private InjectionDao injectionDao;

    public void save(String arg) {
        // 模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDao.save(arg);
    }
}
