package com.issac.SpringDemo.bean;

/**
 * author:  ywy
 * date:  2018-06-13
 * desc:
 */

public class BeanScope {
    public void say() {
        System.out.println("BeanScope say: " + this.hashCode());
    }
}