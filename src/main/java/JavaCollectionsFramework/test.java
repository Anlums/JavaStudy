package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("1");
        System.out.println(v.get(0));
        Map<String,String> map = new HashMap<>();
        map.put("www","22");
        System.out.println(map.get("www"));
    }
}
