package com.atzj.factoryBeanDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 类描述：
 * 实现一个FactoryBean，功能：用来代理一个对象，对该对象的所有方法做一个拦截，在调用前后都输出一行LOG，模仿ProxyFactoryBean的功能。
 * 代理一个类，拦截该类的所有方法，在方法的调用前后进行日志的输出
 * @author zhoujing129
 */
public class FactoryBeanDemo implements FactoryBean<Object>, InitializingBean, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(FactoryBeanDemo.class);
    private String interfaceName;
    private Object target;
    private Object proxyObj;

    @Override
    public void destroy() throws Exception {
        logger.debug("destory()......");
    }

    @Override
    public Object getObject() throws Exception {
        logger.debug("getObject......");
        return proxyObj;
    }

    @Override
    public Class<?> getObjectType() {
        return proxyObj == null ? Object.class : proxyObj.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        proxyObj = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[] {Class.forName(interfaceName)},
                new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                logger.debug("invoke method......" + method.getName());
                logger.debug("invoke method before......" + System.currentTimeMillis());
                Object result = method.invoke(target, args);
                logger.debug("invoke method after......" + System.currentTimeMillis());
                return result;
            }
        });
        logger.debug("afterPropertiesSet......");
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxyObj() {
        return proxyObj;
    }

    public void setProxyObj(Object proxyObj) {
        this.proxyObj = proxyObj;
    }
}
