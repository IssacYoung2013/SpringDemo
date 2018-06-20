package com.issac.SpringDemo.resource;

import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:  2018-06-15
 * desc:
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class MOocResourceTest extends UnitTestBase{

    public MOocResourceTest() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource() {
        MOocResource resource = super.getBean("moocResource");

        try {
            resource.resrouce();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}