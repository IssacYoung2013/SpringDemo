package com.issac.SpringDemo.ioc.interfaces;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
public class Main {
    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImp();

        System.out.println(oif.hello("word"));
    }
}