package 多线程和并发编程实例;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Producer_Consumer_Demo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        Runnable producer = () -> {
            try {
               int count = 1;
               while(true) {
                    String s = "生产者正在生产第" + count + "个产品";
                    count++;
                    queue.put(s);
                    System.out.println(s);
                    Thread.sleep(500);
               }
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () ->{
          try {
              while( true) {
                  String s = queue.take();
                  System.out.println("消费者正在消费：" + s);
                  Thread.sleep(1000);
              }


          }  catch (InterruptedException e) {
              e.printStackTrace();
          }

        };

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
