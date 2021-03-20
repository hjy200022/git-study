package com.hjy.edu.hdu.单例;
/**
 * lazy loading懒汉式
 * 在加锁的基础上再优化，减少加锁代码块的数量
 * @author hjy
 */

public class Singleton4 {
    private static Singleton4 single;

    private Singleton4(){ }

    public static Singleton4 getInstance(){
        if( single == null ){
            synchronized (Singleton4.class){
                // sleep一下，增加被其他线程打断的机会
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                single = new Singleton4();
            }
        }
        return single;
    }
    /**
     * for test
     */
    public static void main(String[] args) {
        //跑同一个类的不同对象的hashcode不同，跑100个线程，看有没有不同的实例
        for (int i = 0; i < 100; i++){
            new Thread(() -> System.out.println(Singleton3.getInstance().hashCode())).start();
        }
        /**
         * 减少了锁的代码量，但远达不到永远单利的目的
         * 「原因分析」：线程A运行完if(INSTANCE == null)，还没拿到锁时候，
         * 线程B也运行到if(INSTANCE == null)这一句并且拿到锁进行了new实例化，
         * 然后线程B释放锁，线程A得到锁继续运行if语句块里面的内容进行new的过程，
         * 这样就出现了不同的实例了。
         */
    }
}
