package com.issac.SpringDemo.aop.schema.advice.biz;

import com.issac.SpringDemo.aop.schema.advice.Fit;
import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-22
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AspectBizTest extends UnitTestBase{

    public AspectBizTest() {
        super("classpath*:spring-aop-schema-advice.xml");
    }

    @Test
    public void testBiz() {
        AspectBiz aspectBiz= super.getBean("aspectBiz");
        aspectBiz.init("moocService",3);
    }

    @Test
    public void testFit() {
        Fit fit = (Fit)super.getBean("aspectBiz");
        fit.filter();
    }
}