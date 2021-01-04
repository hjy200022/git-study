package hjy.hdu.两个线程交替打印奇偶数;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author
 * 线程A打印奇数，线程B打印偶数，线程A、B交替打印，使用JDK提供的并发类库实现
 * 考虑和对象监视器功能接近的可重入锁ReentrankLock
 */
public class OccasionB {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private final int limit;
    private volatile int count;

    public OccasionB(int limit, int iniCount) {
        this.limit = limit;
        this.count = iniCount;
    }

    public void print() {
        lock.lock();
        try {
            while (count < limit) {
                System.out.println(String.format("线程[%s]打印的数字:%d", Thread.currentThread().getName(), ++count));
                condition.signalAll();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OccasionB B = new OccasionB(10,0);
        Thread thread1 = new Thread(B::print,"Thread-1");
        Thread thread2 = new Thread(B::print,"Thread-2");
        thread1.start();
        thread2.start();
        Thread.sleep(Integer.MAX_VALUE);
    }
}
