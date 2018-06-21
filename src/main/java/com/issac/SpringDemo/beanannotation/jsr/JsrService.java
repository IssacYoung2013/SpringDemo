package com.issac.SpringDemo.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * author:  ywy
 * date:  2018-06-20
 * desc:
 *
 */
@Service
public class JsrService {

    @Resource
    private JsrDAO jsrDAO;

    public void save() {
        jsrDAO.save();
    }
}