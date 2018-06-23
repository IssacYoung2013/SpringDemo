package com.issac.SpringDemo.aop.schema.advisors;

import com.issac.SpringDemo.aop.schema.advisors.service.InvokeService;
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
public class AopSchemaAdvisorsTest extends UnitTestBase{
    public AopSchemaAdvisorsTest() {
        super("classpath:spring-aop-schema-advisor.xml");
    }

    @Test
    public void testSave() {
        InvokeService invokeService =  super.getBean("invokeService");
        invokeService.invoke();

        System.out.println();
        invokeService.invokeException();
    }
}