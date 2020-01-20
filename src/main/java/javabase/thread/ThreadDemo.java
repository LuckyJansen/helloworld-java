package javabase.thread;

/**
 * Created by GAOJIANXIN637 on 2019-6-14.
 */ //第二种方法：通过继承Thread类实现多线程类
class ThreadDemo extends Thread{
    private Thread t ;
    private String threadName;

    ThreadDemo(String name){
        threadName = name;
        System.out.println("creating "+threadName);
    }

    @Override
    public void run(){
        System.out.println("Running " + threadName);

        for (int i = 4;i>0;i--){
            System.out.println("Thread:"+threadName+","+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread " +  threadName + " interrupted.");
            }

        }

        System.out.println("Thread "+threadName+" exiting.");
    }

    @Override
    public void start(){
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }


}
