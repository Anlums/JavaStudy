package Interface.test3;

public class test {
    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        inter.method1();
        inter.method2();
        inter.method3();
        inter.func();
        //接口中的静态方法只能通过接口名调用,不能用实现类类名或者对象名调用
//        inter.method4();
//        InterImpl.method4();
        InterA.method4();
    }
}
