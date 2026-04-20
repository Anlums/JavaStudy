package 多线程和并发编程实例;

public class synchronizedDemo {
    private int count = 10;
    public synchronized void sell () {
        if(count > 0) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 卖了第 " + count + " 张票");
            count--;
        }
        else {
            System.out.println("票卖完了");
        }

    }
    public static void main(String[] args) {
        synchronizedDemo sd = new synchronizedDemo();

        Runnable task = () -> {
            while(true) {
                sd.sell();
            }
        };
        new Thread(task,"1号窗口").start();
        new Thread(task,"2号窗口").start();
        new Thread(task,"3号窗口").start();
    }

}
