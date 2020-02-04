package cn.luotuoyulang.test;

/**
 * Ye类代码
 */
public class Ye {

    private String name;

    private String color;

    public Ye() {
        System.out.println("Ye类无参构造方法被调用");
    }

    public Ye(String name, String color) {
        System.out.println("Ye类有参构造方法被调用");
        this.name = name;
        this.color = color;
    }
}
