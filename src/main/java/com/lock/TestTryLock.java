package com.lock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestTryLock {

    private List<Object> list = new ArrayList<Object>();
    private Lock         lock = new ReentrantLock();

    public static void main(String[] args) {
        final TestTryLock test = new TestTryLock();
        new Thread("第一个线程  ") {

            @Override
            public void run() {
                test.doSomething(Thread.currentThread());
            }
        }.start();

        new Thread("第二个线程  ") {

            @Override
            public void run() {
                test.doSomething(Thread.currentThread());
            }
        }.start();
    }

    public void doSomething(Thread thread) {
        if (lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "得到了锁.");
                for (int i = 0; i < 10; i++) {
                    list.add(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println(thread.getName() + "释放了锁.");
                lock.unlock();
            }
        } else {
            System.out.println(thread.getName() + "获取锁失败.");
        }
    }
}