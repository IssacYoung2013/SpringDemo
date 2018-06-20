package com.issac.SpringDemo.beanannotation.jsr;

import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-20
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class JsrServiceTest extends UnitTestBase{
    public JsrServiceTest() {
        super("classpath*:spring-beanannotation.xml");
    }
}