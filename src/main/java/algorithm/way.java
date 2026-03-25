package algorithm;

import java.util.Scanner;

public class way {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10] ;
        int k = 0;
        int sum = 0;
        while(k < 5) {
            int num = sc.nextInt();
            if(num < 0 || num > 100) continue;
            arr[k] = num;
            k++;
            sum += num;
        }
        sum -= maxa(arr)+mina(arr);
        System.out.println(sum/3);
    }
    public  static  int maxa(int []a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int mina(int []a) {
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

}
