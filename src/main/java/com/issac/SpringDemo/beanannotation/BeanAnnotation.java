package com.issac.SpringDemo.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * author:  ywy
 * date:  2018-06-15
 * desc:
 *
 */
@Component("bean")
@Scope
public class BeanAnnotation {

    public void say(String arg) {
        System.out.println("BeanAnnotation: " + arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation: " + this.hashCode());
    }
}