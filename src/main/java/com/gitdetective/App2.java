package com.gitdetective;

import com.google.common.collect.Lists;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List arrayList = Lists.newArrayList();
        MyClass yay = new MyClass();
        arrayList.add(yay);

        yay.myMethod();
        System.out.println(arrayList.size());
    }

    public static void anotherOne(String s, int bb) {
        MyClass yay = new MyClass();
        yay.myMethod2("test");
    }
}
