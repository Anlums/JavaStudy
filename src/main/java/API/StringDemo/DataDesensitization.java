package API.StringDemo;

import java.util.Scanner;

public class DataDesensitization {
    public static void main(String[] args) {
        //public String substring(int beginIndex, int endIndex): 截取指定范围
        //public String substring(int beginIndex): 截取到末尾
        String s = "abcdefg";
        char c = s.charAt(0);
        String subs = s.substring(0, 1) + "***";
        System.out.println(subs);
        /*
          String replace(旧值，新值)  替换
          注意点：只有返回值才是替换之后的结果

          需求：
              过滤玩游戏中骂人的脏话
         */

        String str = "111,TMD";
        String res = str.replace("TMD", "***");
        System.out.println(res);

        String[] arr = {"TMD", "SB", "FU"};
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i], "***");
        }
        System.out.println(msg);

    }

}
