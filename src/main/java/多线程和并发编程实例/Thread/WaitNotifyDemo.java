package 多线程和并发编程实例.Thread;

public class WaitNotifyDemo {
    //生产者与消费者。一个线程生产数据，另一个线程消费，没数据时消费线程要等着。
    private static final Object lock = new Object();
    private static boolean hasData = false;

    public static void main(String[] args) {
        // 启动多个线程 = 默认异步执行
        // 加了 synchronized = 某些地方同步（排队）
        // 消费者
        //1.
        new Thread(() -> {
            synchronized (lock) {
                while (!hasData) {
                    try {
                        System.out.println("没货，消费者等一下...");
                        lock.wait(); // 释放锁，进入等待
                        //wait() 就是让线程"休眠等待"，节省资源，等别人"叫醒"它继续干活！
                    } catch (InterruptedException e) {}
                }
                System.out.println("有货了，消费者开吃！");
            }
        }).start();

        // 生产者
        //2.
        new Thread(() -> {
            synchronized (lock) {
                System.out.println("生产者正在做饭...");
                hasData = true;
                lock.notify(); // 唤醒正在等的线程
                //notify()：唤醒一个等待线程
                //notifyAll()：唤醒所有等待线程
                System.out.println("生产者做好了，叫人吃饭。");
            }
        }).start();

//        消费者线程                    生产者线程                    hasData
//────────────────────────────────────────────────────────────────────
//1. 获取 lock
//2. 检查 hasData = false
//3. 打印"没货，消费者等一下..."
//4. lock.wait() ← 释放锁，等待     │                       false
//                                    5. 获取 lock（成功）
//                                    6. hasData = true
//                                    7. lock.notify() ← 唤醒消费者
//                                    8. 释放 lock         true
//9. 被唤醒，继续执行
//10. 重新获取 lock
//11. 检查 hasData = true，退出循环
//12. 打印"有货了，消费者开吃！"


    }
}