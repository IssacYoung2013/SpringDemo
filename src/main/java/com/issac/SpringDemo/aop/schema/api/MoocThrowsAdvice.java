package com.issac.SpringDemo.aop.schema.api;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class MoocThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e) throws Throwable{
        System.out.println("MoocThrowsAdvice afterThrowing 1");
    }

    public void afterThrowing(Method method,Object[] args,Object target, Exception e) throws Throwable{
        System.out.println("MoocThrowsAdvice afterThrowing 2 :" + method.getName() + "   " + target.getClass().getName());
    }
}
