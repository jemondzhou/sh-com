package com.sh.common.demo2001;

/**
 * @author zhoukai
 * @date 2020/1/9
 */
public class Demo010901 {

    public static void main(String[] args) throws Exception {

        Foo foo = new Foo();
        Thread thread1 = new Thread(printFirst(foo));
        Thread thread2 = new Thread(printTwo(foo));
        Thread thread3 = new Thread(printThree(foo));
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }

    static Runnable printFirst(Foo foo) {
        return () -> {
            foo.one();
        };
    }


    static Runnable printTwo(Foo foo) {
        return () -> {
            foo.two();
        };
    }

    static Runnable printThree(Foo foo) {
        return () -> {
            foo.three();
        };
    }
}
