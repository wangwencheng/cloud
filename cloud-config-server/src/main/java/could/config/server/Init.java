package could.config.server;

/**
 * @author wangwencheng
 * @ClassName: could.config.server
 * @Description:
 * @date 2018/2/12 9:37
 */
 class Parents {
     static int a=100;
     static {
         System.out.println("Parent init");
     }
}
class Child extends Parents{
    static {
        System.out.println("Child init");
    }
}
public class Init{
    public static void main(String[] args) {
       // System.out.println(Child.a);
        String s1 = new StringBuilder().append("String").append("Test").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(s2.intern() == s2);

    }
}