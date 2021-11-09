package com.my.hello;

public class Hello {
    String toWhom = "world";
    public Hello() {
    }
    public Hello(String toWhom) {
        this.toWhom = toWhom;
    }
    public void sayHello() {
        System.out.printf("hello %s!", toWhom);
    }
}
