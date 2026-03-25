package test;

import Util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class array {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int []arr = new int[] {33,5,22,44,55,33};
//        int num = sc.nextInt();
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num) {
//                flag = true;
//                System.out.println(i);
//                break;
//            }
//        }
//        if(!flag){
//            System.out.println("该数据不存在");
//        }

//        int maxi = arr[0];
//        for (int c : arr) {
//            maxi = Math.max(maxi, c);
//        }
//        System.out.println( maxi);
//        Random r = new Random();
//        Random r = new Random();
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arr.length; i++) {
//            int randomindex = r.nextInt(arr.length);
//            int temp = arr[i];
//            arr[i] = arr[randomindex];
//            arr[randomindex] = temp;
//        }
        Random r =  new Random();
        int [] arr = new int[10];
        int []visit = new int[100];
        int [] arr1 = new int[10];
        for (int i = 0; i < arr.length ;i++) {
            int num = r.nextInt(100);
            arr[i] = num;
//            visit[num]++;
        }
        for(int i = 0; i < arr.length; i++) {
            if (visit[arr[i]] == 0) {
                arr1[i] = arr[i];
                visit[arr[i]]++;
            }
        }
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        ArrayUtil.printArray(a);
        System.out.println(ArrayUtil.printArray1(a));


    }
}