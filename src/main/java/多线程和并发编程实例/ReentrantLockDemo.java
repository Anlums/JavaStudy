package 多线程和并发编程实例;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private ReentrantLock lock1 = new ReentrantLock();
    private ReentrantLock lock2 = new ReentrantLock();

    public void safeMethod() {
        try {
            if(lock1.tryLock(1, TimeUnit.SECONDS)){
                try {
                    System.out.println("线程" + Thread.currentThread().getName() + "获取锁1成功");
                    if(lock2.tryLock(1, TimeUnit.SECONDS)){
                        try {
                            System.out.println("线程" + Thread.currentThread().getName() + "获取锁2成功");
                        } finally {
                            lock2.unlock();
                        }
                    }
                    else {
                        System.out.println("线程" + Thread.currentThread().getName() + "获取锁2失败");
                    }
                } finally {
                    lock1.unlock();
                }
            }
            else {
                System.out.println("线程" + Thread.currentThread().getName() + "获取锁1失败");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo demo = new ReentrantLockDemo();
        new Thread(demo::safeMethod, "线程1").start();
        new Thread(demo::safeMethod, "线程2").start();
        new Thread(demo::safeMethod, "线程3").start();

    }
}
