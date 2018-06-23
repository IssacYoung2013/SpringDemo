package com.issac.SpringDemo.aop.schema.api.introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 *
 *
 * @author Issac
 *  *   @date    2018-06-23
 * @desc
 */
public class LockMixinAdivsor extends DefaultIntroductionAdvisor {

    private static final long serialVersionUID = -171332350782163120L;

    public LockMixinAdivsor() {
        super(new LockMixin(),Lockable.class);
    }
}
