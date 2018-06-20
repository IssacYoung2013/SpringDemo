package com.issac.SpringDemo.ioc.injection.dao;

/**
 *
 * author:  ywy
 * date:  2018-06-13
 * desc:
 *
 */
public class InjectionDAOImp implements InjectionDAO {
    @Override
    public void save(String arg) {
        // 模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}