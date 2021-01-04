package hjy.hdu.单例;
/**
 * 单例特点： 1.私有构造函数 2.私有静态全局对象 3.公有静态方法
 * 饿汉式
 * 类加载时候就实例化一个实例，jvm保证线程安全
 * @author 胡嘉跃
 */
public class Singleton1 {
    /**
     * 私有构造方法，其他地方不能new
     */
    private Singleton1(){}
    /**
     * 私有静态全局变量(FINAL关键字修饰为常量）
     * private static final Singleton1 SINGLETON_1;
     * static{
     *    SINGLETON_1 = new Singleton1();
     * }
     * 上方法可以替代下面
     * private static final Singleton1 SINGLETON_1 = new Singleton1();
     */
    private static final Singleton1 SINGLETON_1;
    static{
        SINGLETON_1 = new Singleton1();
    }
    /**
     * 公有静态方法
     */
    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }
    /**
     * for test
     */
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println(singleton1.equals(singleton11));
    }

}
