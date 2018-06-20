package com.issac.SpringDemo.autowiring;

import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-14
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringServiceTest extends UnitTestBase{
    public AutoWiringServiceTest() {
        super("classpath*:spring-autowiring.xml");
    }

    @Test
    public void testSay() {
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("this is a test");
    }

}