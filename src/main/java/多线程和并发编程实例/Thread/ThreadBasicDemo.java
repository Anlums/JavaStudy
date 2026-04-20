package 多线程和并发编程实例.Thread;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class ThreadBasicDemo {
    public static void main(String[] args) throws Exception {
        //AtomicInteger 使用 CAS（Compare And Swap） 机制，
        //确保 ++ 操作是原子的，不会被其他线程打断：
        //考虑线程安全
        AtomicInteger count = new AtomicInteger(0);
        // 1. Runnable：只管干活，不拿工资（无返回值）
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
            System.out.println(Thread.currentThread().getName() + " 正在搬砖..." + count.get());
        };
        new Thread(task1, "工人A").start();
        Runnable task3 = () ->{

        };
        new Thread(task3, "工人C").start();

        // 2. Callable：干完活要拿回结果（带返回值）
        Callable<String> task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
            Thread.sleep(1000);
            return "工人B的任务报酬：100块" + count.get();
        };

        // FutureTask 是中介，负责拿到 Callable 的结果
        FutureTask<String> futureTask = new FutureTask<>(task2);
        new Thread(futureTask, "工人B").start();

        // 此时主线程会阻塞，直到拿到结果
        System.out.println("等待结果中...");
        System.out.println(futureTask.get());
        System.out.println(count.get());
    }
}
