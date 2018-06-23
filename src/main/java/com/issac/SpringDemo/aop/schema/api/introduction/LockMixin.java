package com.issac.SpringDemo.aop.schema.api.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    public static final long serialVersionUID = 6943163819932660450L;

    private boolean locked;

    @Override
    public void lock() {
        this.locked = true;
    }

    @Override
    public void unlock() {
        this.locked = false;
    }

    @Override
    public boolean locked() {
        return this.locked;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if(locked() && invocation.getMethod().getName().indexOf("set") == 0) {
            throw new RuntimeException();
        }

        return super.invoke(invocation);
    }
}
