package com.issac.SpringDemo.beanannotation;

import com.issac.SpringDemo.base.UnitTestBase;
import com.issac.SpringDemo.beanannotation.injection.multibean.BeanInvoker;
import com.issac.SpringDemo.beanannotation.injection.service.InjectionService;
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
public class BeanAnnotationTest extends UnitTestBase{
    public BeanAnnotationTest() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void Say() {
        BeanAnnotation bean = super.getBean("bean");
        bean.say("This is a test");

        bean = super.getBean("beanAnnotation");
        bean.say("This is a test");
    }

    @Test
    public void testScope(){
        BeanAnnotation bean = super.getBean("bean");
        bean.myHashCode();

        bean = super.getBean("bean");
        bean.myHashCode();
    }

    @Test
    public void testAutowired() {
        InjectionService service = super.getBean("injectionServiceImp");
        service.save("This is autowired.");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}

