package API.StringDemo;

public class TestString {
    public static void main(String[] args) {
        /*
          第一种：直接赋值
          第二种：new 关键字
              public String()                          空白字符串，不含任何内容
              public String(String original)           根据传入的字符串，创建新的字符串对象
              public String(char[] chs)                根据字符数组，创建字符串对象
              public String(byte[] chs)                根据字节数组，创建字符串对象
        */
        String s1 = "hello world";
        System.out.println(s1);
        System.out.println("--------------");

        String s2 = new String();
        System.out.println(s2);
        System.out.println("--------------");

//        String s3 = new String("hello world");
        String s3 = new String(s1);
        System.out.println(s3);
        System.out.println("--------------");

        char[]  chs = {'h','a','a'};
        String s4 = new String(chs);
        System.out.println(s4);
        System.out.println("--------------");

        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);
        System.out.println("--------------");


    }
}
