package com.atzj.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class MainCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        CollectionDi collectionDi = (CollectionDi) context.getBean("collection");
        collectionDi.getAddressList();
        collectionDi.getAddressSet();
        collectionDi.getAddressMap();
        collectionDi.getAddressProps();
    }
}
