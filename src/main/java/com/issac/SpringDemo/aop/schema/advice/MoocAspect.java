package com.issac.SpringDemo.aop.schema.advice;

/**
 *
 * author:  ywy
 * date:  2018-06-22
 * desc:
 *
 */
public class MoocAspect {
    public void before() {
        System.out.println("MoocAspect before");
    }

    public void afterReturning() {
        System.out.println("MoocAspect afterReturning");
    }
    
    public void after() {
        System.out.println("MoocAspect after");
    }
}