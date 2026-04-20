package JavaCollectionsFramework.CollectionsInterface.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//它内部有两个非常核心的属性：
//
//elementData：一个 Object[] 类型的数组。这就是 ArrayList 真正用来装元素的容器。
//
//size：一个 int 类型的变量，记录当前集合中实际包含了多少个元素（注意区分 size 和数组的 length 容量）。

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. 创建 ArrayList (建议声明为接口 List)
        List<String> list = new ArrayList<>();

        // 2. 增加元素
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add(1, "Go"); // 在下标 1 处插入，此时 Python 和 C++ 都要往后挪

        System.out.println("当前列表: " + list); // [Java, Go, Python, C++]

        // 3. 修改元素
        list.set(3, "Rust"); // 将下标3的 C++ 替换为 Rust

        // 4. 获取元素
        System.out.println("第2个元素是: " + list.get(1)); // Go

        // 5. 正确的安全删除方式 (使用迭代器或者 Java 8 的 removeIf)
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String lang = iterator.next();
            if ("Python".equals(lang)) {
                iterator.remove(); // 安全删除！不要用 list.remove(lang)
            }
        }

        // Java 8 更优雅的写法：
        // list.removeIf(lang -> "Python".equals(lang));

        System.out.println("删除后: " + list);
    }
}