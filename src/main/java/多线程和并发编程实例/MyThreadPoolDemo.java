package 多线程和并发编程实例;

import java.util.concurrent.*;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //corePoolSize (核心线程数)：公司的“正式员工”。哪怕没活干，他们也一直待命。
        //maximumPoolSize (最大线程数)：公司总人数。正式工 + 临时工的总上限。
        //keepAliveTime (空闲生存时间)：临时工没活干时，能撑多久才被裁掉。
        //unit (时间单位)：生存时间的单位（如秒、分钟）。
        //workQueue (任务队列)：公司的“排队室”。正式工忙不过来时，客户在这里排队。
        //threadFactory (线程工厂)：招聘员工的部门。给线程起个好听的名字。
        //handler (拒绝策略)：如果正式工、临时工全都在忙，排队室也挤满了，新客户怎么办？
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                3,5,5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for(int i = 1 ; i <= 10 ; i++){
            final int taskId = i;
            try{
                tpe.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " 正在处理任务..." + taskId );
                });
            } catch (RejectedExecutionException e) {
                System.err.println("任务 " + i + " 被拒绝了！");
            }
        }
        tpe.shutdown();
    }
}
