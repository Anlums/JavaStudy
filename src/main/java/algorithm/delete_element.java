package algorithm;

import java.util.Scanner;

public class delete_element {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int []a = new int[8] ;
        for (int i = 0; i < a.length; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int val = sc.nextInt();
        int []b = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] !=  val) b[k++] = a[i];
        }
            print(b,k);
    }
    public static void print(int []a,int k)
        {
            for (int i = 0; i < k; i++) {
                System.out.print(a[i] + " ");
            }
        }

}
