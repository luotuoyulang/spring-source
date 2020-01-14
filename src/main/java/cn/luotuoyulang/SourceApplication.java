package cn.luotuoyulang;

import cn.luotuoyulang.config.MyScannerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyScannerConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
