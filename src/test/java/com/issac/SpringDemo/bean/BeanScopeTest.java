package com.issac.SpringDemo.bean;

import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase{
    public BeanScopeTest() {
        super("classpath*:spring-scope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }

    @Test
    public void testSay2() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

    }
}