package cn.luotuoyulang.test;

/**
 * 子类代码
 */
public class Zi extends Fu{

    private String color;

    private String name;

    public Zi() {
        System.out.println("Zi类无构造方法被调用");
    }

    public Zi(String color, String name) {
        System.out.println("Zi类有构造方法被调用");
        this.color = color;
        this.name = name;
    }
}
