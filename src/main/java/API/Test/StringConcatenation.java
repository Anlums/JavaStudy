package API.Test;

public class StringConcatenation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("[");
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1)
            sb.append(arr[i]+",");
            else sb.append(arr[i]);
        }
        sb.append("]");
        String s = sb.toString();
        System.out.println(s);

    }

}
