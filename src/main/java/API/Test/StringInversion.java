package API.Test;

import java.util.Scanner;

public class StringInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.next();
        while(!str.equals("exit")) {
            StringBuilder sb = new StringBuilder(str);
            sb = sb.reverse();
            String str1 = sb.toString();
            System.out.println(str1);
            str = sc.next();
        }

    }
}
