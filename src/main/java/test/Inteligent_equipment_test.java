//package test;
//import javabean.Android_phone_extends;
//import javabean.Apple_extends;
//import javabean.Laptop_extends;
//public class Inteligent_equipment_test {
//    /*
//    java只支持单继承不支持多继承，
//    一个子类只能继承一个父类，不能继承多个父类
//    但支持多层继承（如下），有直接父类和间接父类，object是顶级父类，所有的类都是object的子类，没继承父类的，虚拟机默认继承object类
//    */
//
//
//    public static void main(String[] args) {
//        Android_phone_extends a = new Android_phone_extends();
//        a.brand = "华为";
//        a.price = 5000;
//        //类里边进行了方法重写
//        a.call();
//        a.sendMessage();
//        a.nfc();
//        System.out.println(a.brand + "  " + a.price);
//        a.jiujin();
//        System.out.println("--------------------");
//
//        Apple_extends b = new Apple_extends();
//        b.brand = "苹果";
//        b.price = 12000;
//        b.call();
//        b.sendMessage();
//        System.out.println(b.brand + "  " + b.price);
//        Laptop_extends c = new Laptop_extends();
//        c.brand = "华硕";
//        c.price = 8000;
//        c.code();
//        System.out.println(c.brand + "  " + c.price);
//
//    }
//
//
//}
