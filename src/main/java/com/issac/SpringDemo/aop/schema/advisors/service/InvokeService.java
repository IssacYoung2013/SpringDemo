package com.issac.SpringDemo.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
@Service
public class InvokeService {
    public void invoke() {
        System.out.println("InvokeService ...");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("")
                ;
    }
}
