package javabean;

public enum enum_javabean {
    /*
    每一个枚举项，都是该枚举类的对象，每一个枚举项都是构造方法构造的
    枚举项在底层其实就是常量，默认用public static final修饰
    枚举类的第一行上必须是枚举项，枚举项之间用逗号隔开，以分号作为结尾
    枚举类的构造方法必须是private修饰，不让外界创建本类的对象
    编译器会给枚举类新增两个默认存在的方法：values(), valueOf()
    values() 获取本类的所有枚举项
    valueOf() 获取某一项枚举项

    */

    A("张三"),
    B("王五"),
    C("赵六"),
    D("111");


    private String name;

    private enum_javabean(String name) {
        System.out.println("看看我执行么了枚举项的构造方法");
        this.name = name;
    }

    private enum_javabean() {
    }

    public String getName() {
        return name;
    }

}
