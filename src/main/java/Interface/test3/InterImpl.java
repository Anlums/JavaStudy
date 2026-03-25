package Interface.test3;

public class InterImpl implements InterA, IntetB {
    @Override
    public void method1() {
        System.out.println("111");
    }

    @Override
    public void method2() {
        System.out.println("222");
    }
    //只有虚方法表里边的方法才能被重写，static，final,private修饰的不在方法表中，
    //方法重写的本质就是替换虚方法表中记录方法的内存地址
    @Override
    public void method3() {
        System.out.println("重写了默认方法");
    }

    @Override
    public void func() {
        System.out.println("重写的两个接口共同点默认方法");
    }
}
