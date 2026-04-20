package JavaCollectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. 创建 HashMap (Key: 姓名, Value: 年龄)
        Map<String, Integer> map = new HashMap<>();

        // 2. 添加数据
        map.put("张三", 25);
        map.put("李四", 30);
        map.put("王五", 28);

        // 3. 获取数据
        System.out.println("张三的年龄: " + map.get("张三"));

        // 4. 判断 Key 是否存在
        if (map.containsKey("李四")) {
            System.out.println("李四在名单中");
        }

        // 5. 遍历方式 (推荐 entrySet)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 6. Java 8 的优雅写法
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
