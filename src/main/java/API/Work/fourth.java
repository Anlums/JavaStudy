package API.Work;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String year = s.substring(6, 10);
        String month = s.substring(10, 12);
        String day = s.substring(12, 14);
        int sex = (int)(s.charAt(16)-'0');
        System.out.println(year + "年" + month + "月" + day + "日");
        System.out.println(sex);
    }
}
