/** 
 * Entry.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.core;

import java.io.IOException;
import java.util.Random;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class Entry implements Cloneable {

    public Entry() {
        TestClass testClass = new TestClass();
        testClass.testMethod();
    }

    public boolean equals(Entry e) {
        return false;
    }
    
    public void copyPasteMethod1() {
        Random randObj = new Random();
        double randomValue = randObj.nextDouble();
        
        // This is the mathematical modle we use
        double value = Math.round(Math.sqrt(Math.pow(randomValue, 2.4)) * randomValue) % 7.0 * randomValue * 1000.0;
        
        // Conditions
        if (value <= 1.0) {
            System.out.println("Less than or equal to 1"); 
        } else if (value <= 10.0) {
            System.out.println("Greater than 1, less than or equal to 10");
        } else if (value <= 30.0) {
            System.out.println("Greater than 10, less than or equal to 30");
        } else {
            System.out.println("Greater than 30");
        }
    }

}