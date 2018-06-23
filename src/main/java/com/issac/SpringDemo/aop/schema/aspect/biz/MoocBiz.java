package com.issac.SpringDemo.aop.schema.aspect.biz;

import com.issac.SpringDemo.aop.schema.aspect.MoocMethod;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
@Service
public class MoocBiz {
    @MoocMethod("MoocBiz save with MoocMethod")
    public String save(String arg){
        System.out.println("MoocBiz save: " + arg);
//        throw new RuntimeException("Save Failed!");
        return "Save success";
    }
}
