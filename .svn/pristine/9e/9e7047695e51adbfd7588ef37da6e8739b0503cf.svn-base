package com.virtusa.gto.pb.core;

import com.virtusa.gto.pb.io.FileWriter;

public class TestClass {

    static TestClass foo = InnerClassSingleton.singleton;

    static class InnerClassSingleton extends TestClass {
        static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static void testMethod() {
        if (foo != null) {
            System.out.println("foo is not null");
        }
    }

    public static void doInvalidCast() {
        Object fileReader = new FileWriter();
        Entry invalidCastedObject = (Entry) fileReader;
        String result = invalidCastedObject == null ? "null" : "not null";
        System.out.println("Result : " + result.toString());

        if (fileReader instanceof String) {
            System.out.println("This line is never printed");
        }

    }

}
