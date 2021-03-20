package com.hjy.edu.hdu.单例;

/*
* 线程安全 双层锁
* synchronized加锁，但是效率会降低
* lazy loading 懒汉式
* */
public class Singleton3 {
    /**
     * 私有构造方法，其他地方不能new
     */
    private Singleton3(){}

    private static Singleton3 single;

    public static synchronized Singleton3 getInstance(){
        if(single == null){
            // sleep一下，增加被其他线程打断的机会
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            single = new Singleton3();
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
        //方法可行，但是效率低
    }
}
