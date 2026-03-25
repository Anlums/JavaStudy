package Util;

public class ArrayUtil {
    // 私有化构造方法，工具类不允许实例化
    private ArrayUtil() {}

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String printArray1(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ",";
        }
        s += "]";
        return s;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

}
