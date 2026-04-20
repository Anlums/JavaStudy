package 多线程和并发编程实例;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo {
    public static void main(String[] args) {
        //ConcurrentHashMap：
        //原理：Java 8 采用 CAS + synchronized + 红黑树，只锁定当前操作的槽位（桶），而不是锁定整个 Map。
        //价值：极高的并发读取和写入效率。

        //CopyOnWriteArrayList：
        //原理：写时复制。当你要修改时，先复制一份副本修改，改完后再将引用指向新副本。
        //适用：读多写少的极佳选择。

        //BlockingQueue (阻塞队列)：
        //典型场景：生产者-消费者模型。
        //价值：自动处理了“队列满时生产者等待”和“队列空时消费者等待”的复杂逻辑。

        // 1. 线程安全的 Map
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Key", "Value");

        // 2. 线程安全的 List (读写分离)
        CopyOnWriteArrayList<Integer> safeList = new CopyOnWriteArrayList<>();
        safeList.add(100);

        // 演示：多线程下安全操作
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                safeList.addIfAbsent(i);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}