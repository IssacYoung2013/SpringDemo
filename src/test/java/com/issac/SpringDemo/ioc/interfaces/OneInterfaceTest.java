package com.issac.SpringDemo.ioc.interfaces;

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
public class OneInterfaceTest extends UnitTestBase{

    public OneInterfaceTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }

}