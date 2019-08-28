package com.atzj.springDI;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("springdi.xml");
        Guozhi guozhi = (Guozhi) context.getBean("guozhi");
        guozhi.getguozhi();
    }
}
