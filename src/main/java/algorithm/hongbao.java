package algorithm;

import java.util.Random;
import java.util.Scanner;

public class hongbao {
    public static void main() {
        int n = 5,m = 2000;
        Scanner sc = new Scanner(System.in);
        if (n > m) {
            return ;
        }
        Random r = new Random();
        for (int i = 1; i < n; i++) {
            // [0,m-n+i-1]
            int mym = r.nextInt(m - (n - i))+1;
            m = m - mym;
            System.out.println(mym);

        }

        System.out.println( m);


    }


}
