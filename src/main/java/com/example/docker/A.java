package com.example.docker;

public class A {
    public synchronized void m1(B b) {
        System.out.println("In A class m1 method");
    }

    public synchronized void last() {
        System.out.println("In A class last method");
    }
}
