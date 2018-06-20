package com.issac.SpringDemo.ioc.injection.service;

import com.issac.SpringDemo.ioc.injection.dao.InjectionDAO;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
public class InjectionServiceImp implements InjectionService {

    public InjectionServiceImp(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    private InjectionDAO injectionDAO;

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        // 模拟业务操作
        System.out.println("Service接收参数： "+arg);
        arg = arg + this.hashCode();
        injectionDAO.save(arg);
    }
}