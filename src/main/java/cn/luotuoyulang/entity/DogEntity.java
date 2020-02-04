package cn.luotuoyulang.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 *  BeanPostProcessor 为什么不能放到同一个实现类里面执行。。。
 *  BeanPostProcessor 后置处理器,对我们的bean 实现增强
 */
public class DogEntity implements BeanPostProcessor {

    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization  ---" +beanName);
        return bean;
    }


    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization ---" +beanName);
        return bean;
    }
}
