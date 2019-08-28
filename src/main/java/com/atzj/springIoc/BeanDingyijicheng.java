package com.atzj.springIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class BeanDingyijicheng {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beanjicheng.xml");

        Hello objA = (Hello) context.getBean("hello");
        objA.getMessage1();
        objA.getMessage2();

        HelloChina objB = (HelloChina) context.getBean("helloChina");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
