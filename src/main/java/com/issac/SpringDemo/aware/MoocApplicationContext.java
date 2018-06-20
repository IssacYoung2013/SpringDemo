package com.issac.SpringDemo.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */

public class MoocApplicationContext implements ApplicationContextAware {

//    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        applicationContext = applicationContext;
        System.out.println("MoocApplicationContext:" + applicationContext.getBean("moocApplicationContext").hashCode());
    }
}