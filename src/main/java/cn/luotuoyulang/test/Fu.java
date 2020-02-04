package cn.luotuoyulang.test;

/**
 * Fu类代码
 */
public class Fu extends Ye{

    private String name;

    private String color;

    public Fu() {
        System.out.println("Fu类无参构造方法被调用");
    }

    public Fu(String name, String color) {
        System.out.println("Fu类有参构造方法被调用");
        this.name = name;
        this.color = color;
    }
}
