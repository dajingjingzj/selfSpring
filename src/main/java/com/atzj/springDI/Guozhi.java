package com.atzj.springDI;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class Guozhi {

    private Zhazhi zhazhi;

    //基于 构造函数 注入
   /* public Guozhi(Zhazhi zhazhi) {
        System.out.println("Inside Guozhi constructor." );
        this.zhazhi = zhazhi;
    }*/

   //基于setter 注入
    public Zhazhi getZhazhi() {
        return zhazhi;
    }
    public void setZhazhi(Zhazhi zhazhi) {
        System.out.println("Inside Guozhi setter." );
        this.zhazhi = zhazhi;
    }

    public void getguozhi(){
        zhazhi.apple();
    }


}
