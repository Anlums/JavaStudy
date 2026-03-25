package API.StringDemo;

import java.util.Scanner;

public class TraverseString {
    public static void main(String[] args) {
        /*
          public char charAt(int index): 根据索引返回字符
          public int length(): 返回此字符串的长度

          需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int bigNum = 0;
        int smallNum = 0;
        int number = 0;
        //字符串遍历中循环的快速生成方式：s.length(). fori
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') smallNum++;
            else if(c >= 'A' && c <= 'Z') bigNum++;
            else if(c >= '0' && c <= '9') number++;
        }
        System.out.println("大写字母有：" + bigNum);
        System.out.println("小写字母有：" + smallNum);
        System.out.println("数字有：" + number);

        int[] arr = {1,2,3};
        String s1 = "";
        s1 += "[";
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) s1 += arr[i] + ",";
            else s1 += arr[i] + "]";
        }
        System.out.println(s1);




    }
}
