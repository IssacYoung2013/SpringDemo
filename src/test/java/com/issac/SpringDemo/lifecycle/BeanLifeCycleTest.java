package com.issac.SpringDemo.lifecycle;

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
public class BeanLifeCycleTest extends UnitTestBase{

    public BeanLifeCycleTest() {
        super("classpath*:spring-lifecycle.xml");
    }


    @Test
    public void test() {
        super.getBean("beanLifeCycle");
    }
}