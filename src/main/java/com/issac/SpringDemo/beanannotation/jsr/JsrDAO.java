package com.issac.SpringDemo.beanannotation.jsr;

import org.springframework.stereotype.Repository;

/**
 *
 * author:  ywy
 * date:  2018-06-20
 * desc:
 *
 */
@Repository
public class JsrDAO {
    public void save() {
        System.out.println("JsrDAO invoked");
    }
}