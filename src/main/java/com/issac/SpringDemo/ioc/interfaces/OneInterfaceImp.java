package com.issac.SpringDemo.ioc.interfaces;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
public class OneInterfaceImp implements OneInterface {
    @Override
    public String hello(String name) {
        return "Word from OneInterfaceImp: " +name;
    }
}