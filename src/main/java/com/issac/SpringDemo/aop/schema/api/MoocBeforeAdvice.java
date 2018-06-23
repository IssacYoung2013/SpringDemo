package com.issac.SpringDemo.aop.schema.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("MoocBeforeAdvice: " + method.getName() + "   "  + o.getClass().getName());
    }
}
