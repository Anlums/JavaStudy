package API.StringDemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        /*
          StringBuilder 的构造方法：
              public StringBuilder()              空参构造
              public StringBuilder(String str)    带参构造

          StringBuilder 的常见成员方法：
              append(任意类型)     添加数据
              reverse()            反转
              int length()         获取长度
              toString             变回字符串
         */
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("123");
        sb2.append("456");
        sb2.append("789");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        System.out.println(sb2.length());

        String res = sb2.toString();
        System.out.println(res);


//        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < 10000; i++) {
//            s += i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

//        long start = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb = new StringBuilder("aaa");
//        for (int i = 0; i < 1000000; i++) {
//            sb.append("aaa");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


    }
}
