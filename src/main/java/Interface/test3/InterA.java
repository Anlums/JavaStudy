package Interface.test3;

public interface InterA {
    //普通私有方法
    private void method5() {
        System.out.println("接口中的私有方法");
    }
    //静态私有方法，供私有方法使用
    private static void method6() {
        System.out.println("接口中的静态私有方法");
    }
    //抽象方法
    public abstract void method1();
    public abstract void method2();
    //默认方法
    public default void method3() {
        System.out.println("接口中的默认方法");
        method5();
    }
    public default void func() {
        System.out.println("A接口中的默认方法");
    }

    //静态方法
    public static void method4() {
        System.out.println("接口中的静态方法");
        method6();
    }



}
