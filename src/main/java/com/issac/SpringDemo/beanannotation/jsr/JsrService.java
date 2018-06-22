package com.issac.SpringDemo.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * author:  ywy
 * date:  2018-06-20
 * desc:
 *
 */
//@Service
@Named
public class JsrService {

//    @Resource
//    @Inject
    private JsrDAO jsrDAO;

//    @Resource
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    public void save() {
        jsrDAO.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrService init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("JsrService destory");
    }
}