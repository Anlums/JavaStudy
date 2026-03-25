package API.Test;

import java.util.Scanner;

public class StringSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
            if(i % 8 == 7) System.out.print(",");
        }
        int l = s.length();
        l =  8-l%8;
        for (int i = 0; i < l; i++) {
            System.out.print("0");
        }
        System.out.println("");
        if(l != 0)
        s += "00000000".substring(0,l);
        for (int i = 0; i < s.length(); i+=8) {
            String sb = s.substring(i,i+8);
            System.out.println(sb);
        }

//        int i = 0;
//        while(i < s.length()) {
//            int j = i+8;
//            if(j <= s.length()){
//                String subs = s.substring(i, j);
//                System.out.println(subs);
//            }
//            else {
//                String subs = s.substring(i);
//                System.out.println( subs);
//                for (int k = 1; k <= 8 - subs.length() ; k++) {
//                    subs = subs + "*";
//                }
//                System.out.println( subs);
//            }
//            i += 8;
//
//        }



    }
}
