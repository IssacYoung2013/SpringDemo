package com.issac.SpringDemo.aop.schema.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class MoocAfterReturingAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("MoocAfterReturingAdvice afterReturning : " + method.getName() + "   " + o1.getClass().getName() + o);
    }
}
