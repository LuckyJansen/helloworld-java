package javabase.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by GAOJIANXIN637 on 2019-6-18.
 */
public class LockDemo {


    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        new Thread("T01") {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                try{
                    lock.lock();
                    for(int i = 0; i<10; i++){
                        System.out.println(thread.getName()+"---"+i);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }.start();

        new Thread("T02") {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                try{
                    lock.lock();
                    for(int i = 0; i<10; i++){
                        System.out.println(thread.getName()+"---"+i);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }.start();

        new Thread("T03"){
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                boolean trylock = false;

                try{
                    trylock = lock.tryLock();
                    System.out.println(thread.getName()+"..."+trylock);
                    if (trylock) {

                        for (int i = 0; i < 10; i++) {
                            System.out.println(thread.getName() + "---" + i);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    //lock.unlock();
                }
            }

        }.start();

        new Thread("T04"){
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                boolean trylock = false;

                try{
                    trylock = lock.tryLock(10, TimeUnit.SECONDS); //持续时间获取锁
                    System.out.println(thread.getName()+"..."+trylock);
                    if (trylock) {

                        for (int i = 0; i < 10; i++) {
                            System.out.println(thread.getName() + "---" + i);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }

        }.start();
    }
}
