package com.atzj.springIoc;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/15
 */
public class MainApp {
    /**
     * ApplicationContext 是 beanFactory的子接口，也是spring 上下文 ，较高级的容器，可以加载配置文件中定义的 bean
     * 将所有bean集中在一起，有请求时分配bean
     * 增加了企业所需要的功能，比如，从属性文件中解析文本信息和将事件传递给所指定的监听器。
     * @param args
     */
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml"); //创建应用程序的上下文
        //处理创建并初始化所有的对象，获得所需要的bean,这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象。
        // 一旦有了对象，你就可以使用这个对象调用任何类的方法。
        Hello obj1 = (Hello) context.getBean("hello");
        obj1.setMessage("this is dajingjing ！"); //通过setter注入属性
        obj1.getMessage();
        Hello obj2 = (Hello) context.getBean("hello");
        obj2.getMessage();*/
    }
}
