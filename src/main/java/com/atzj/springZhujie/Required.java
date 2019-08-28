package com.atzj.springZhujie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class Required {
    public static void main(String[] args) {
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("requiredBean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );*/

        ApplicationContext context = new ClassPathXmlApplicationContext("requiredBean.xml");
        TextEditor2 te = (TextEditor2) context.getBean("textEditor");
        te.spellCheck();
    }
}
