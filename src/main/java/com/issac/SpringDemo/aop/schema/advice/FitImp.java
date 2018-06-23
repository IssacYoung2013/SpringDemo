package com.issac.SpringDemo.aop.schema.advice;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class FitImp implements Fit {
    @Override
    public void filter() {
        System.out.println("FitImp filter");
    }
}
