package JavaCollectionsFramework.CollectionsInterface.List;
import java.util.*;

//LinkedList 是 Java 集合框架中 List 接口的另一个重要实现。它的底层是基于 双向链表 实现的，
//同时它还实现了 Deque 接口，因此它既可以当做列表使用，也可以当做队列或栈使用。

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. 基本添加
        list.add("Apple");
        list.add("Banana");

        // 2. 特有的首尾操作 (ArrayList 没有这些)
        list.addFirst("First Fruit");
        list.addLast("Last Fruit");

        System.out.println("当前链表内容: " + list);

        // 3. 获取第一个和最后一个
        System.out.println("第一个是: " + list.getFirst());
        System.out.println("最后一个是: " + list.getLast());

        // 4. 删除
        list.removeFirst();
        list.removeLast();

        System.out.println("删除首尾后: " + list);
    }
}
