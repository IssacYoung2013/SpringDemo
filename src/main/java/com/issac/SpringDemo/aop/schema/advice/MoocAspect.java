package com.issac.SpringDemo.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

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

    public void afterThrowing() {
        System.out.println("MoocAspect afterThrowing");
    }

    public Object around(ProceedingJoinPoint pip) {
        Object obj = null;
        try {
            System.out.println("MoocAspect around");
            obj = pip.proceed();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }
}