package com.issac.SpringDemo.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class ConcurrentOperationExecutor {

    public static final int DEFATUL_MAX_RETRIES = 2;

    private int maxRetries = DEFATUL_MAX_RETRIES;

    private int order = 1;

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pip) throws Throwable {
        int numAttemps = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttemps ++;
            System.out.println("Try times: " + numAttemps);
            try {
                return pip.proceed();
            }
            catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        }
        while (numAttemps <= this.maxRetries);
        System.out.println("Try erro: " + numAttemps);
        throw lockingFailureException;
    }
}
