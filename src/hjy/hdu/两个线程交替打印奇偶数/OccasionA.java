package hjy.hdu.两个线程交替打印奇偶数;
/**
 * @author
 * 线程A打印奇数，线程B打印偶数，线程A、B交替打印，使用对象监视器实现
 * A和B线程只要有一者竞争锁成功，就打印++i，通知其他进程从等待集合释放，然后自身线程加入等待稽核并释放
 */

public class OccasionA {
    private final Object monitor = new Object();
    private final int limit;
    private volatile int count;

    public OccasionA(int limit,int initCount){
        this.limit = limit;
        this.count = initCount;
    }
    public void print(){
        synchronized (monitor){
            while (count < limit){
                try {
                    System.out.println(String.format("线程[%s]打印数字:%d",Thread.currentThread().getName(),++count));
                    monitor.notifyAll();
                    monitor.wait();
                } catch (InterruptedException e) {
                    //ignore
                }
            }
        }
    }

    public static void main(String[] args) {
        OccasionA A = new OccasionA(10,0);
        Thread thread1 = new Thread(A::print,"thread-1");
        Thread thread2 = new Thread(A::print,"thread-2");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
