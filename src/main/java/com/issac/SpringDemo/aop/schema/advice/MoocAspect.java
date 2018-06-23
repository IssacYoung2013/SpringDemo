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
            System.out.println("MoocAspect around 1");
            obj = pip.proceed();
            System.out.println("MoocAspect around 2");

        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pip,String bizName,int times) {
        System.out.println(bizName + "  " + times);
        Object obj = null;
        try {
            System.out.println("MoocAspect aroundInit 1");
            obj = pip.proceed();
            System.out.println("MoocAspect aroundInit 2");

        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }
}