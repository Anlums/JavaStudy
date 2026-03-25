package innerClass.MemberInnerClass;
//外部类
public class Outer1 {
    private String brand;

    //成员内部类，可以被修饰符修饰，private 默认  protected public static
    public class publicInner {
        private double volume;
        //JDK16之后成员内部类可以定义static变量
        static final int MAX_HORSE_POWER = 1200;
   }
   //私有内部类
    private class privateInner{
        int a;
    }

    //外部类中编写方法，对外提供内部类的方法（常用语私有内部类private）
    public publicInner getPublicInner() {
        return new publicInner();
    }
    public privateInner getPrivateInner(){
        return new privateInner();
    }
    int a = 10;
    public  class Inner{
        int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);//30
            System.out.println(this.a);//20
            System.out.println(Outer1.this.a);//10
        }
    }




}
