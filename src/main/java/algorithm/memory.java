package algorithm;

public class memory {
    //psvm
    static void main() {
        int a = 10;
        int b = 20;
        change(a,b);
        //sout
        System.out.println(a + " " + b);
    }
    public static void change(int a,int b) {
        int temp = a;
        a = b;
        b = temp;

    }

}
