package algorithm;

public class zhongweishu {
    public  static  void  main() {
        int []a = {1,2,3,4,5,6,7,8,9};
        int []b = {1,2,3,4,5,6,7,8,9};
        int []c = new int[a.length+b.length+10];
        int k = 0;
        int ai = 0,bi = 0;

        while (ai < a.length && bi < b.length) {
            if(a[ai] < b[ bi]) c[k++] = a[ai++];
            else c[k++] = b[bi++];
        }
        while (ai < a.length) c[k++] = a[ai++];
        while (bi < b.length) c[k++] = b[bi++];
        int mid;
        if(k % 2 == 0) mid = (c[k/2] + c[k/2-1])/2;
        else mid = c[k/2];


    }



}