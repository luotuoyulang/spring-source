package cn.luotuoyulang;

import cn.luotuoyulang.config.MyScannerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  IOC 容器初始化单例对象都是循环遍历调用 getBean 方法
 *  refresh();  初始化bean
 *  applicationContext.getBean("dogController");  调用 doGetBean(name, null, null, false); 方法
 */
public class SourceApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyScannerConfig.class);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        applicationContext.getBean("dogController");
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        applicationContext.close();
    }
}
