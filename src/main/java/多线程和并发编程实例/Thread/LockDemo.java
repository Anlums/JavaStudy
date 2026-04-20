package 多线程和并发编程实例.Thread;
import java.util.concurrent.locks.ReentrantLock;
public class LockDemo {
    //当两个线程同时给一个变量 count++ 时，结果往往不对。这时候需要“上锁”。
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    // 方案 A：使用 synchronized 关键字（自动上锁/释放）
    public synchronized void incrementSync() {
        count++;
    }

    // 方案 B：使用 ReentrantLock（手动上锁，更灵活）
    public void incrementLock() {
        lock.lock(); // 加锁
        try {
            count++;
        } finally {
            lock.unlock(); // 必须在 finally 里释放锁，防止程序崩了导致死锁
        }
    }
}
