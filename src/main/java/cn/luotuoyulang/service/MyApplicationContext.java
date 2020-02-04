package cn.luotuoyulang.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationContext implements ApplicationContextAware {

    /**
     * spring 底层中为什么能够实现ApplicationContextAware 接口 就能够拿到 ApplicationContext
     * @param applicationContext
     * @throws BeansException
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
