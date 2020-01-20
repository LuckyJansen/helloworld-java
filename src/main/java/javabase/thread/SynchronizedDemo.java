package javabase.thread;

/**
 * Created by GAOJIANXIN637 on 2019-6-14.
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread("aa"){
            @Override
            public void run(){
                synchronized ("a"){
                    String name = Thread.currentThread().getName();
                    System.out.println(name+" start");
//                    int i = 1/0; //释放锁的两个条件：1.当前进程报错；2.当前进程运行完成。
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+" 醒了end");
                }
            }
        };

        Thread t2 = new Thread("bb"){
            @Override
            public void run(){
                synchronized ("a"){
                    String name = Thread.currentThread().getName();
                    System.out.println(name+" start");
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name+" 醒了end");
                }

            }
        };

        t1.start();
        t2.start();
    }

}
