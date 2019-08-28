package com.atzj.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("BeansAutowire.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansAutowireGouzao.xml");
        Gouzaozhuangpei te = (Gouzaozhuangpei) context.getBean("beansAutowire");
        te.spellCheck();
        te.getName();
    }
}
