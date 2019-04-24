package com.test.service.impl.springLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean{
    private String name;
    private String address;
    private int phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("person构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("注入属性name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("注入属性address");
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        System.out.println("注入属性phone");
        this.phone = phone;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware.setBeanName()");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet()");
    }

    public void myInit(){
        System.out.println("myInit()");
    }

    public void myDestory(){
        System.out.println("myDestory()");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
