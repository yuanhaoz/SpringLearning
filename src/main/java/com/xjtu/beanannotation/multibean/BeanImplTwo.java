package com.xjtu.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by 18710 on 2017/8/6.
 */
@Order(1) // 排序
@Component
public class BeanImplTwo implements BeanInterface{
}
