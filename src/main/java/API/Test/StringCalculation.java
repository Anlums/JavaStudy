package API.Test;

import java.util.Scanner;

public class StringCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int[] arr1 = copyData(s1.toCharArray(),s1.toCharArray().length);
        int[] arr2 = copyData(s2.toCharArray(),s2.toCharArray().length);
        int len = Math.max(arr1.length, arr2.length);
        char[] ans = new char[len+1];
        ans[0] = '0';
        int z = 0,i = arr1.length-1,j = arr2.length-1;
        while(i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + z;
            if(sum >= 10) {
                z = sum / 10;
                ans[i+1] = (char)(sum % 10 + '0');
            }
            else {
                z = 0;
                ans[i+1] = (char)(sum + '0');
            }
            i--;j--;
        }

        for(int k = i - j - 1 ; k >= 0; k--) {
            int sum = arr1[k] + z;
            if(sum >= 10) {
                z = sum / 10;
                ans[k+1] = (char)(sum % 10 + '0');
            }
            else {
                z = 0;
                ans[k+1] = (char)(sum + '0');
            }
        }
        if (z > 0){
            ans[0] = (char)(z + '0');
        }
        String s = new String(ans);
        System.out.println(s);
    }
    public static int[] copyData(char[] arr,int len) {
        int[] ans = new int[len];
        for(int i = 0; i < len; i++) {
            ans[i] = arr[i] - '0';
        }
        return ans;
    }
}
