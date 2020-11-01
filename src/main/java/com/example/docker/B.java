package com.example.docker;

public class B {
    public synchronized void m2(A a) {
        System.out.println("In A class m2 method");

    }

    public synchronized void last() {
        System.out.println("In B class last method");
    }
}
