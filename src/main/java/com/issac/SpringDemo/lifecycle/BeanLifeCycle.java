package com.issac.SpringDemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * author:  ywy
 * date:  2018-06-13
 * desc:
 */

public class BeanLifeCycle implements InitializingBean, DisposableBean {

    public void start() {
        System.out.println("Bean Start...");
    }

    public void stop() {
        System.out.println("Bean Stop...");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean afterPropertiesSet...");

    }

//    public void defaultDestroy() {
//        System.out.println("Bean defaultDestroy...");
//    }
//
//    public void defaultInit() {
//        System.out.println("Bean defaultInit...");
//
//    }
}