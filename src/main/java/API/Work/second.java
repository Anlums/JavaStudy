package API.Work;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
        char c = sc.next().charAt(0);
        int ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c || (Math.abs(arr[i] - c)) == 32) {
                ans++;
            }
        }
        System.out.println(ans);


    }

}
