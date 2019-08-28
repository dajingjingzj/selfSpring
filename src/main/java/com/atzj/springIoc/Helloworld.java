package com.atzj.springIoc;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/15
 */
public class Helloworld {
    private String message;

    public void init(){
        System.out.println("this is init Beans");
    }

    public void destory(){
        System.out.println("this is destory Beans");
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
