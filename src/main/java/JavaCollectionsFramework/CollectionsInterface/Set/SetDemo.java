package JavaCollectionsFramework.CollectionsInterface.Set;
import java.util.*;
//Set 接口代表一种无序且不可重复的集合。它主要有三个实现类：HashSet、LinkedHashSet 和 TreeSet。

//1. HashSet：披着羊皮的狼
//为什么说它“披着羊皮”？因为你翻开 HashSet 的源码会发现，它内部竟然直接定义了一个 HashMap！
//实现原理：当你向 HashSet 添加一个元素时，它实际上是把这个元素作为 Key 存入了内部的 HashMap 中，
// 而 Value 则统一放一个没意义的虚拟对象（名为 PRESENT）。
//如何去重：利用 HashMap 的 Key 不可重复的特性。它会先比较 hashCode()，如果相同再比较 equals()。
// 只有两者都相同，才认为是同一个元素。
//特点：
//无序：不保证存进去和取出来的顺序一致。
//允许 null：但只能有一个 null。
//        2. LinkedHashSet：有序的去重
//它是 HashSet 的子类。
//原理：内部使用的是 LinkedHashMap。
//特点：在去重的基础上，通过双向链表记录了元素的插入顺序。
//
//        3. TreeSet：会自动排队的集合
//原理：内部使用的是 TreeMap（红黑树）。
//特点：
//有序：它不是按插入顺序，而是按元素的自然顺序（如 1, 2, 3 或 A, B, C）或者你指定的排序规则排序。
//性能：增删改查都是 $O(\log n)$。


public class SetDemo {
    public static void main(String[] args) {
        // 1. HashSet: 自动去重，顺序随机
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Apple"); // 重复元素，存不进去
        System.out.println("HashSet (无序): " + hashSet);

        // 2. LinkedHashSet: 去重，且保持插入顺序
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Banana");
        linkedSet.add("Apple");
        System.out.println("LinkedHashSet (有序): " + linkedSet);

        // 3. TreeSet: 自动排序
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet (自动排序): " + treeSet); // [10, 30, 50]
    }
}