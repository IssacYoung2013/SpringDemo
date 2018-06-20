package com.issac.SpringDemo.ioc.interfaces;

import com.issac.SpringDemo.base.UnitTestBase;
import com.issac.SpringDemo.ioc.injection.service.InjectionService;
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
public class TestInjection extends UnitTestBase{
    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void testSetter() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("这是保存的数据");
    }

    @Test
    public void testCons(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("这是保存的数据");
    }
}