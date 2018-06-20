package com.issac.SpringDemo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * author:  ywy
 * date:  2018-06-13
 * desc:
 */
public class MoocBeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext" + applicationContext.getBean(beanName).hashCode());
    }

    @Override
    public void setBeanName(String s) {

        beanName = s;

        System.out.println("MoocBeanName: " + s);
    }
}