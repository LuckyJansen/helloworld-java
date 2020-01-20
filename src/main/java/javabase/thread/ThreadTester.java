package javabase.thread;

public class ThreadTester {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thead-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thead-2");
        r2.start();

        ThreadDemo r3 = new ThreadDemo("Thead-3");
        r3.start();
    }
}

