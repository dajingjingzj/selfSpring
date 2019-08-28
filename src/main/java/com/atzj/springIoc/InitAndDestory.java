package com.atzj.springIoc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/15
 */
public class InitAndDestory {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Helloworld obj = (Helloworld) context.getBean("helloworld");
        obj.getMessage();
        //需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
        // 它将确保正常关闭，并且调用相关的 destroy 方法.如果是ApplicationContext ，没有关闭hook，则销毁bean方法不会被调用。
        // 因为这是非Web应用程序的使用，是在JVM中使用的，需要注册关闭hook,这样可以确保正常关闭，释放所有资源
        context.registerShutdownHook();
    }
}
