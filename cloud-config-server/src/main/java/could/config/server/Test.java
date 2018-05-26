package could.config.server;

/**
 * @author wangwencheng
 * @ClassName: could.config.server
 * @Description:
 * @date 2018/2/9 10:58
 */
public class Test {

    public enum Fruit{
         apple,orange,banara
    }

    public static void test(Fruit f){
        switch (f){
            case apple:
                System.out.println("I am Apple");
                break;
            case orange:
                System.out.println("I am  Orange");
                break;
            case banara:
                System.out.println("I am Banara");
                break;
            default:
                System.out.println("I am juice");
                break;
        }
    }




    public static void main(String[] args) {
        /*for(Fruit f:Fruit.values()){
            test(f);
        }*/
        ThreadLocal<String> tlm=new ThreadLocal<String>();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
              tlm.set(Thread.currentThread()+" I am threadlocal");
              System.out.println(tlm.get());
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+tlm.get());
            }
        });
         t1.start();
         t2.start();
        System.out.println(Thread.currentThread());
    }
}
