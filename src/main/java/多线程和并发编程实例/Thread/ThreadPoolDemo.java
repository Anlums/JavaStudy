package 多线程和并发编程实例.Thread;
import java.util.concurrent.*;
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 在真实项目中，绝对不允许 new Thread()。我们用线程池来复用线程。
        // 自定义线程池（生产环境建议写法）

        //corePoolSize: 核心线程数（哪怕空闲也不会被解雇的员工）。
        //maximumPoolSize: 最大线程数（包含临时工的总上限）。
        //keepAliveTime: 临时工空闲多久后自动解雇。
        //workQueue: 任务队列，当核心线程满时，任务在这里排队。
        //handler: 拒绝策略，当排队也排不下时，如何处理新任务
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,          // 核心线程数：常驻工人数
                5,                      // 最大线程数：加上临时工的总上限
                60,                     // 临时工空闲多久被解雇
                TimeUnit.SECONDS,       // 时间单位
                new LinkedBlockingQueue<>(10), // 候工区：最多排队10个人
                Executors.defaultThreadFactory(), // 生产线程的工厂
                new ThreadPoolExecutor.AbortPolicy() // 拒绝策略：忙不过来直接报错
        );

        // 提交 15 个任务
        for (int i = 1; i <= 15; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " 正在处理任务 " + taskId);
                try { Thread.sleep(5000); } catch (InterruptedException e) {}
            });
        }

        executor.shutdown(); // 关闭线程池

        ThreadPoolExecutor executor2 = new ThreadPoolExecutor(
            2,5,60,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(20),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.DiscardOldestPolicy()
        );

    }
}
