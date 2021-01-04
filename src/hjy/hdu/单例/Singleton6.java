package hjy.hdu.单例;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类---也可实现懒加载
 * @author 行百里er
 */
public class Singleton6 {

    /**
     * 私有的构造方法，其他地方不能new
     */
    private Singleton6() {
    }

    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * for test
     */
    public static void main(String[] args) {
        //同一个类的不同对象的hashcode不同
        //跑100个线程，看看有没有不同的实例
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton6.getInstance().hashCode())).start();
        }
    }
}