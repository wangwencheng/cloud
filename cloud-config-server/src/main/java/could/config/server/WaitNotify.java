package could.config.server;

import java.util.concurrent.TimeUnit;

/**
 * @author wangwencheng
 * @ClassName: could.config.server
 * @Description:
 * @date 2018/2/11 10:09
 */
public class WaitNotify {
    static Object lock=new Object();
    static boolean flag=true;

    public static void main(String[] args) {
          Thread t1=new Thread(new Wait(),"wait Thread");
          t1.start();
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2=new Thread(new Notify(),"Notify Thread");
          t2.start();
    }

    static class Wait implements Runnable{

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            synchronized (lock){
                while(flag){
                    try {
                        System.out.println(Thread.currentThread() + " flag is true");
                        lock.wait();
                    }catch (Exception e){

                    }
                }
                System.out.println(Thread.currentThread() + " flag is false");
            }
        }
    }

     static class Notify implements Runnable{

         /**
          * When an object implementing interface <code>Runnable</code> is used
          * to create a thread, starting the thread causes the object's
          * <code>run</code> method to be called in that separately executing
          * thread.
          * <p>
          * The general contract of the method <code>run</code> is that it may
          * take any action whatsoever.
          *
          * @see Thread#run()
          */
         @Override
         public void run() {
             synchronized (lock){
                 flag=false;
                 lock.notifyAll();
                 try {
                     TimeUnit.SECONDS.sleep(7);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     }

}
