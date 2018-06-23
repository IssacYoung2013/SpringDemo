package com.issac.SpringDemo.aop.schema.api.introduction;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public interface Lockable {
    void lock();
    void unlock();
    boolean locked();
}
