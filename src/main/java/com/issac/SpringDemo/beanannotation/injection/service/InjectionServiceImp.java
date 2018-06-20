package com.issac.SpringDemo.beanannotation.injection.service;

import com.issac.SpringDemo.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
@Service
public class InjectionServiceImp implements InjectionService {

    @Autowired
    public InjectionServiceImp(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //@Autowired
    private InjectionDAO injectionDAO;

    //@Autowired
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