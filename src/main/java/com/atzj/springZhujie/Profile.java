package com.atzj.springZhujie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student1 student1;

    @Autowired
    @Qualifier("student2")
    private Student1 student2;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }
    public void printAge() {
        System.out.println("Age : " + student2.getAge() );
    }
    public void printName() {
        System.out.println("Name : " + student2.getName() );
    }
}
