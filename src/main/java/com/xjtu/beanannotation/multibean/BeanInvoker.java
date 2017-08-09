package com.xjtu.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 18710 on 2017/8/6.
 */
@Service
public class BeanInvoker {

    // 自动注入接口的两个实现类
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo") // 指定BeanInterface具体为哪一个实现类
    private BeanInterface beanInterface;

    public void getList() {
        if (null != list && 0 != list.size()) {
            System.out.println("list...");
            for (BeanInterface beanInterface : list) {
                System.out.println(beanInterface.getClass().getName());
            }
        } else {
            System.out.println("list is null...");
        }
    }

    public void getMap() {
        if (null != map && 0 != map.size()) {
            System.out.println("map...");
            for (String key : map.keySet()) {
                System.out.println(key + " " + map.get(key).getClass().getName());
            }
        } else {
            System.out.println("map is null...");
        }

        if (beanInterface != null) {
            System.out.println(beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null...");
        }


    }

}
