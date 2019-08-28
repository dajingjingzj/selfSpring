package com.atzj.springZhujie;

import org.springframework.beans.factory.annotation.Required;

/**
 * 类描述：
 *  @Required 注释应用于 bean 属性的 setter 方法
 *  可以使用 @Autowired 的 （required=false） 选项关闭默认行为，在xml中就不是必须配置
 * @author zhoujing129
 * @date 2019/7/16
 */
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
