package com.issac.SpringDemo.aop.schema.api;

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
public class AOPAPTTest  extends UnitTestBase{
    public AOPAPTTest() {
        super("classpath:spring-aop-api.xml");
    }

    @Test
    public void testSave() {
        BizLogic logic = (BizLogic) super.getBean("bizLogicImp");
        logic.save();
    }
}