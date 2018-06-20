package com.issac.SpringDemo.aware;

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
public class MoocApplicationContextTest extends UnitTestBase{

    public MoocApplicationContextTest() {
        super("classpath*:spring-aware.xml");
    }

//    @Test
//    public void testMoocApplicationContext() {
//        System.out.println("MoocApplicationContextTest: "+ super.getBean("moocApplicationContext").hashCode());
//    }

    @Test
    public void testMoocBeanName() {
        System.out.println("testMoocBeanName: "+ super.getBean("moocBeanName"));
    }
}