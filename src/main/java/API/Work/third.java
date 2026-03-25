package API.Work;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = s.lastIndexOf(" ");
        System.out.println(s.substring(i+1).length());

    }
}
