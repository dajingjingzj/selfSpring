package com.atzj.springIoc;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/15
 */
public class MainAppone {
    /**
     * beanFactory容器 不推荐使用 xmlBeanFactory是对于beanFactory的一个实现
     * 从xml文件中读取配置元数据
     * @param args
     */
    /*public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Bean.xml"));
        Hello obj = (Hello) beanFactory.getBean("hello");//通过配置文件中的 bean ID 来返回一个真正的对象
        obj.getMessage();
    }*/
}
