package com.issac.SpringDemo.beanannotation.injection.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * author:  ywy
 * date:  2018-06-15
 * desc:
 *
 */
@Order(3)
@Component
public class BeanInterfaceImlOne implements BeanInterface {
}