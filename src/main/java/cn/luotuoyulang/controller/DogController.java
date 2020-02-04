package cn.luotuoyulang.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

//@Controller
//@Scope(value = "singleton")
public class DogController {

    public DogController() {
        System.out.println("DogController 无参构造方法执行啦。。。。。");
    }

    private void initMethod() {
        System.out.println("initMethod 执行啦。。。。。");
    }

    private void destroyMethod() {
        System.out.println("destroyMethod 执行啦。。。。。。");
    }
}
