package com.issac.SpringDemo.aop.schema.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
@Component
@Aspect
public class MoocAspect {
    @Pointcut("execution(* com.issac.SpringDemo.aop.schema.aspect.biz.*Biz.*(..)) ")
    public void pointcut(){}

    @Pointcut("within(com.issac.SpringDemo.aop.schema.aspect.biz.*)")
    public void bizPointCut(){}

//    @Before("execution(* com.issac.SpringDemo.aop.schema.aspect.biz.*Biz.*(..))")
    // 引入一个定义好的切入点
    @Before("pointcut()")
    public void before(){
        System.out.println("Before.");
    }

    @AfterReturning(pointcut = "pointcut()",returning = "returnValue")
    public void afterReturning(Object returnValue){
        System.out.println("AfterReturning:" + returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println("AfterThrowing: " + e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("After.");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pip) throws Throwable{
        System.out.println("Around 1");
        Object obj = pip.proceed();
        System.out.println("Around 2");
        System.out.println("Around Return:" + obj);
        return obj;
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg){
        System.out.println("Before WithParam." + arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnoation(MoocMethod moocMethod){
        System.out.println("Before WithAnnotation." + moocMethod.value());
    }
}
