package com.xjtu.autowiring;

/**
 *
 * Created by 18710 on 2017/8/6.
 */
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

//    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
//        System.out.println("set method");
//        this.autoWiringDAO = autoWiringDAO;
//    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
//        System.out.println("AutoWiringService : " + word);
    }

}
