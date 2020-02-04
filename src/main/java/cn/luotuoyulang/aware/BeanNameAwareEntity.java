package cn.luotuoyulang.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;


public class BeanNameAwareEntity implements BeanNameAware , BeanFactoryAware , InitializingBean , ApplicationContextAware {

    public BeanNameAwareEntity() {
        System.out.println("BeanNameAwareEntity 构造方法执行啦。。。。");
    }

    /**
     * 作用：获取 name 信息
     * @param name
     */
    public void setBeanName(String name) {
        System.out.println("BeanNameAwareEntity    setBeanName   aware  执行啦。。。。。。");
    }

    /**
     *  作用：获取 beanFactory 信息
     * @param beanFactory
     * @throws BeansException
     */
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanNameAwareEntity    setBeanFactory  aware 执行啦。。。。。");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet..............");
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext  执行啦。。。。。");
    }
}
