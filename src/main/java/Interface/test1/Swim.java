package Interface.test1;

public interface Swim {
    //成员变量默认public static final修饰，只能是常量
    int a = 10;
//    接口没有构造方法
//    public Swim() {}
    //抽象方法，默认public abstract修饰,可以省略
    public abstract void swim();
}
