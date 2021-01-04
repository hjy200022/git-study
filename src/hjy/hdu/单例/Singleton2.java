package hjy.hdu.单例;
/**
 * 懒汉式:用到才实例化
 * @author hjy
 */
public class Singleton2 {
    /**
     * 私有构造方法，其他地方不能new
     */
    static int MAXSIZE = 100;

    private Singleton2(){}

    private static Singleton2 single;

    public static Singleton2 getInstance(){
        if(single ==null){
            // sleep一下，增加被其他线程打断的机会
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            single = new Singleton2();
        }
        return single;
    }
    /**
     * for test
     */
    public static void main(String[] args) {
        //跑同一个类的不同对象的hashcode不同，跑100个线程，看有没有不同的实例
        for (int i = 0; i < MAXSIZE; i++){
            new Thread(() -> System.out.println(Singleton2.getInstance().hashCode())).start();
        }
    }
    /**
     * 有hashcode不同的实例没说明这个类不能很好实现单例
     */
}
