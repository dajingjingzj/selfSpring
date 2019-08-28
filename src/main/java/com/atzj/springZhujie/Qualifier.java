package com.atzj.springZhujie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 * 当你创建多个具有相同类型的 bean 时，并且想要用一个属性只为它们其中的一个进行装配，在这种情况下，
 * 你可以使用 @Qualifier 注释和 @Autowired 注释通过指定哪一个真正的 bean 将会被装配来消除混乱。
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class Qualifier{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }
}
