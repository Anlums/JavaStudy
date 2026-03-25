package innerClass.StaticInnerClass;

public class Outer2 {
    int a = 10;
    static int b = 20;


    static class Inner{
        public  void show1() {
            Outer2 o = new Outer2();
            System.out.println(o.a);
            System.out.println(b);
        }
        public static void show2() {
            Outer2 o = new Outer2();
            System.out.println(o.a);
            System.out.println(b);
        }


    }

}
