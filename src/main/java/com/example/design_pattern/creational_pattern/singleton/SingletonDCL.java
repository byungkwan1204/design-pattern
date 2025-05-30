package com.example.design_pattern.creational_pattern.singleton;

/**
 * DCL : Dirty-Checked Locking
 */
public final class SingletonDCL {

    private static SingletonDCL instance;
    public String value;

    private SingletonDCL(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static SingletonDCL getInstance(String value) {

        SingletonDCL result = instance;
        if (result != null) {
            return result;
        }

        synchronized (SingletonDCL.class) {

            if (instance == null) {
                instance = new SingletonDCL(value);
            }

            return instance;
        }
    }
}
