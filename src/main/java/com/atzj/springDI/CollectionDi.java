package com.atzj.springDI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 类描述：
 *
 * @author zhoujing129
 * @date 2019/7/16
 */
public class CollectionDi {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProps;

    public List getAddressList() {
        System.out.println("this is "+addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("this is "+addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("this is "+addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProps() {
        System.out.println("this is "+addressProps);
        return addressProps;
    }

    public void setAddressProps(Properties addressProps) {
        this.addressProps = addressProps;
    }
}
