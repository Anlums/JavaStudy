package innerClass.StaticInnerClass;

public class Test2 {
    public static void main(String[] args) {
        Outer2.Inner oi = new Outer2.Inner();
        oi.show1();
        oi.show2();
        Outer2.Inner.show2();
    }
}
