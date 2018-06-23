package com.issac.SpringDemo.aop.schema.api;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class BizLogicImp implements BizLogic {
    @Override
    public String save() {
        System.out.println("BizLogicImp: Logic save");
//        throw new RuntimeException();
        return "Logic save";
    }
}
