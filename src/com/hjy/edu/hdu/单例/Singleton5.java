package com.hjy.edu.hdu.单例;

/**
 * 懒汉
 * 在加锁的基础上再优化，减少加锁代码块的数量
 * 双重检查DCL
 * @author hjy
 */

public class Singleton5 {
    private Singleton5(){}

    private static Singleton5 single = new Singleton5();

    private static Singleton5 getInstance(){
        //第一重检查
        if (single == null){
            synchronized (Singleton5.class) {
                //第二重检查
                if (single == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    single = new Singleton5();
                }
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
         */
    }
}
/*
* 「INSTANCE要不要加volatile」？

答案是肯定的。

「volatile」的作用是「保证线程可见性和禁止指令重排序」。在DCL单利模式写法中，volatile主要是用于禁止指令重排序的。因为如果不加volatile关键字，那么可能会出现指令重排序。

假设：一个线程A执行到 「INSTANCE = new Singleton_6()」 的时候，经过编译器编译，会分成三个指令（注意 INSTANCE 是static的）：

给指令申请内存

给成员变量初始化

把这块内存的内容赋值给INSTANCE

既然有值了，那么线程B上来先进行检查发现已经有值，就不会进入加锁那部分的代码了。

加了「volatile」后，就不允许指令重排序了。所以此时一定是保证线程A初始化完了才会复制给这个变量。
* */