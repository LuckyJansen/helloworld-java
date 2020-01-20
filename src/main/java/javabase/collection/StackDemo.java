package javabase.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack st, int i){
        st.push(new Integer(i));
        System.out.println("push(" + i + ")");
        System.out.println("stack:" + st );
    }

    static void showpop(Stack st){
        System.out.println("pop -> " + st.pop());
        System.out.println("stack:" + st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        showpush(st,3);
        showpush(st,5);
        showpush(st,6);
        showpush(st,7);
        showpush(st,8);

        try {
            showpop(st);
            showpop(st);
            showpop(st);
            showpop(st);
            showpop(st);
            showpop(st);
            showpop(st);
        } catch (EmptyStackException e){
            System.out.println(e);
            System.out.println("empty stack.");
        }
    }
}
