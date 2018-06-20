package com.issac.SpringDemo.beanannotation.javabased;

import com.issac.SpringDemo.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-19
 * @desc
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class JavaBasedTest extends UnitTestBase{
    public JavaBasedTest() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void test() {
        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManger() {
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }

    @Test
    public void testScope() {
        Store store = super.getBean("store");
        System.out.println(store.hashCode());

        store = super.getBean("store");
        System.out.println(store.hashCode());
    }

    @Test
    public void testG() {
        StringStore store = super.getBean("stringStoreTest");
    }
}