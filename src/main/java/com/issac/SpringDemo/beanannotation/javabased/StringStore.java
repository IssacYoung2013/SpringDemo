package com.issac.SpringDemo.beanannotation.javabased;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-19
 * @desc
 */
public class StringStore implements Store<String> {

    public void init() {
        System.out.println("This is init ...");
    }

    public void destroy() {
        System.out.println("This is destroy...");
    }
}
