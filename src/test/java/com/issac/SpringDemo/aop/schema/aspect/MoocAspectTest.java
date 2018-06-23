package com.issac.SpringDemo.aop.schema.aspect;

import com.issac.SpringDemo.aop.schema.aspect.biz.MoocBiz;
import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class MoocAspectTest extends UnitTestBase{
    public MoocAspectTest() {
        super("classpath:spring-aop-aspect.xml");
    }

    @Test
    public void testSave() {
        MoocBiz biz = super.getBean("moocBiz");
        biz.save("This is a test");
    }
}