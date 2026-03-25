package algorithm;

import java.util.Random;

public class vote {
    static void main() {
        int n = 1000;
        int cnt1 = 0,cnt2 = 0;
        int[] a = new int[6];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int c = r.nextInt(0,6);
            if(c == 0) cnt1++;
            else {
                cnt2++;
                a[c]++;
            }
        }
        int maxi = -1,ans = -1;
        for (int i = 1; i <= 5 ; i++) {
            if(a[i] > maxi) {
                maxi = a[i];
                ans = i;
            }
        }
        System.out.println(ans);
        System.out.println(cnt1 +"  "+ cnt1*1.0/1000);
    }

}
