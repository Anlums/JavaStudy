package API.StringDemo;

public class OtherCommonMethod {
    public static void main(String[] args) {
        /*
          String 类当中常见的方法：
          比较              equals  equalsIgnoreCase
          长度              length
          获取单个字符      charAt
          截取              substring
          替换              replace

          是否包含          contains
          判断开头、结尾    startsWith/endsWith
          查找              indexOf(int ch)      lastIndexOf(int ch)
          判断是否为空      isEmpty()
          转字符数组        toCharArray()
          大小写转换        toUpperCase()、toLowerCase()
          去除头尾空格      trim()
         */
        String str = "abcdefa";
        // 是否包含  contains --- 敏感词过滤 TMD
        boolean b = str.contains("abd");
        System.out.println(b);

        // 判断开头、结尾    startsWith/endsWith
        // 判断文件的后缀名  a.txt
        // 判断 str 是否以 bc 作为开头
        boolean b2 = str.startsWith("bc");
        // 判断 str 从 1 索引开始，是否以 bc 开头
        boolean b3 = str.startsWith("bc", 1);
        System.out.println(b2);
        boolean b4 = str.endsWith(".txt");
        System.out.println(b4);

        // 查找    indexOf(int ch)    lastIndexOf(int ch)
        // 查找当前字符/字符串 第一次出现的索引，如果当前要查找的内容不存在，方法会返回 -1
        int i1 = str.indexOf(97);
        System.out.println(i1);// 0
        int i2 = str.lastIndexOf(97);
        System.out.println(i2);// 6

        int i3 = str.indexOf("A");
        System.out.println(i3);// -1

        // 判断是否为空    isEmpty()  登录注册
        boolean empty1 = str.isEmpty();
        System.out.println(empty1);// false

        String str2 = "";
        boolean empty2 = str2.isEmpty();
        System.out.println(empty2); // tru

        // 转字符数组    toCharArray()
        // "abc"  --> 0 索引 改为 A
        // "abcdaefg" ----> ['a','b','c','d','a','e','f','g']
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 大小写转换    toUpperCase()、toLowerCase()
        // abcde...
        String upperCase = str.toUpperCase();
        System.out.println(upperCase); // ABCDAEFG

        // 去除头尾空格    trim()
        String str3 = " a b c ";
        String trim = str3.trim();
        System.out.println(trim);//a b c





    }
}
