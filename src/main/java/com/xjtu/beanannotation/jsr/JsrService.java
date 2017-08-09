package com.xjtu.beanannotation.jsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 18710 on 2017/8/7.
 */
@Service
public class JsrService {

//    @Resource
    private JsrDAO jsrDAO;

    @Resource // 和@Autowired方法很相似
    public void setJsrDAO(JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    public void save() {
        jsrDAO.save();
    }

}
