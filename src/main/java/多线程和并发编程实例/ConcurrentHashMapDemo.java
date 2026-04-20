package 多线程和并发编程实例;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Java", 100);

        // ❌ 错误示范：这不是原子的，多线程下可能导致计数错误
        /*
        if (!map.containsKey("Java")) {
            map.put("Java", 1);
        }
        */

        // ✅ 正确示范 1：如果不存在则放入
        map.putIfAbsent("Python", 1);

        // ✅ 正确示范 2：计算并更新（最强大的方法）
        // 比如：给 Java 的分值加 1
        map.computeIfPresent("Java", (key, value) -> value + 1);

        System.out.println("最终 Map: " + map);
    }
}
