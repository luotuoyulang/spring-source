package cn.luotuoyulang.config;

import cn.luotuoyulang.aware.BeanNameAwareEntity;
import cn.luotuoyulang.controller.DogController;
import cn.luotuoyulang.entity.DogEntity;
import cn.luotuoyulang.test.Fu;
import cn.luotuoyulang.test.Ye;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@ComponentScan("cn.luotuoyulang.service")
@Configuration
@Import({DogEntity.class})
public class MyScannerConfig {

//    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
//    public DogController dogController(){
//        return new DogController();
//    }

    @Bean
    public BeanNameAwareEntity beanNameAwareEntity(){
        return new BeanNameAwareEntity();
    }
}
