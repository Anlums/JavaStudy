package innerClass.LocalInnerClass;

public class Outer3 {
    int b = 20;
    public void show() {
        //public等只能修饰成员变量和方法，不能修饰局部变量
        int a = 10;

         class Inner{
                String name;
                int age;
                public void method1() {
                    System.out.println("方法一");
                }
        }
        Inner i = new Inner();
        i.method1();
        System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(b);
        System.out.println(a);

    }


}
