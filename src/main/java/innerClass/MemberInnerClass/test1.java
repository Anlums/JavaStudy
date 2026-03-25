package innerClass.MemberInnerClass;

public class test1 {
    public static void main(String[] args) {
        //直接创建成员内部类对象
        Outer1.publicInner oi = new Outer1().new publicInner();
        //通过外部类方法创建成员内部类对象
        Outer1.publicInner oi1 = new Outer1().getPublicInner();
        //私有的内部类，外部不能直接创建对象，可以赋值给父类的类型
        //Outer.privateInner oi3 = new Outer().new privateInner();
        Object oi2 = new Outer1().getPrivateInner();






    }
}
