package com.example.design_pattern.creational_pattern.singleton;

public class DemoMultiThreadDCL {

    public static void main(String[] args) {

        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                           "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                           "RESULT:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

        // expected : FOO, FOO
        // actual : FOO, FOO (스레드 실행 순서에 따라 BAR, BAR 가 출력될 수 도있다.)
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonDCL singleton = SingletonDCL.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonDCL singleton = SingletonDCL.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
