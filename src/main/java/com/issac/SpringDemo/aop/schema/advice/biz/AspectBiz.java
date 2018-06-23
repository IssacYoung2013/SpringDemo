package com.issac.SpringDemo.aop.schema.advice.biz;

/**
 *
 * author:  ywy
 * date:  2018-06-22
 * desc:
 *
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz biz");
//        throw new RuntimeException();
    }

    public void init(String bizName,int times) {
        System.out.println("AspectBiz init: " + bizName + "  " + times);
    }
}