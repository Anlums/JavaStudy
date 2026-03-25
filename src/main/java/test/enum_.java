package test;
import javabean.enum_javabean;
public class enum_ {
    public static void main(String[] args) {
        // 获取枚举类的对象
        // 细节:
        // 所有的枚举项, 默认使用public static final修饰的
        enum_javabean e = enum_javabean.A;
        System.out.println(e.getName());

        switch (e){
            case A:
                System.out.println("张三");
                break;
            case B:
                System.out.println("王五");
                break;
            case C:
                System.out.println("赵六");
                break;
            case D:
                System.out.println("111");
                break;
                default:
        }


        enum_javabean[]  values = enum_javabean.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("------------------");
        enum_javabean e1 = enum_javabean.valueOf("A");
        System.out.println(e1);
    }


}
