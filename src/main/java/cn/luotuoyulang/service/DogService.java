package cn.luotuoyulang.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
public class DogService {
//        implements InitializingBean, DisposableBean {

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet..............");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy....................");
    }
}
