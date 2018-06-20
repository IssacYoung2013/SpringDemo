package com.issac.SpringDemo.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
@Repository
public class InjectionDAOImp implements InjectionDAO {
    @Override
    public void save(String arg) {
        // 模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}