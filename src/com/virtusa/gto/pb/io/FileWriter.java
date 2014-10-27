/** 
 * FileWriter.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class FileWriter {

    private String outputFilePath;

    public FileWriter() {

    }

    public FileWriter(String outputFilePath) {
        writeZipFile(outputFilePath);
    }

    public void writeZipFile(String zipFilePath) {
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(
                    zipFilePath));

            ZipEntry zipEntry = new ZipEntry("Test");
            zipOut.putNextEntry(zipEntry);
            zipOut.closeEntry();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /**
     * This is a complex method with Cyclimatic COmplexity = 22 
     */
    public void complexMethod(int inputNumber) {
        int remainder = inputNumber % 9;

        if (remainder % 2 == 0) {
            System.out.println("Remainder is an Even number");
        } else {
            System.out.println("Remainder is an Odd number");
        }

        switch (remainder) {
        case 1:
            System.out.println("Remainder is 1");
            break;
        case 2:
            System.out.println("Remainder is 2");
            break;
        case 3:
            System.out.println("Remainder is 3");
            break;
        case 4:
            System.out.println("Remainder is 4");
            int remainder2 = (remainder + inputNumber) % 3;
            for (int i = 0; i <= remainder2; i++) {
                System.out.println("Iterator is " + String.valueOf(i));
                if (i == 2) {
                    System.out.println("This is the largest i can get");
                }
            }
            break;
        case 5:
            System.out.println("Remainder is 5");
            break;
        case 6:
            System.out.println("Remainder is 6");
            break;
        case 7:
            System.out.println("Remainder is 7");
            if (((remainder + inputNumber) % 4) == 0) {
                System.out.println("This is a factor of 4");
            } else {
                System.out.println("This is not a factor of 4");
                if ((remainder + inputNumber) % 3 == 0) {
                    System.out.println("This is a factor of 3");
                } else {
                    System.out.println("This is not a factor of 3");
                }
            }
            break;
        case 8:
            System.out.println("Remainder is 8");
            if (((remainder + inputNumber) % 4) == 0) {
                System.out.println("This is a factor of 4");
            } else {
                System.out.println("This is not a factor of 4");
                if (remainder % 2 == 0) {
                    System.out.println("This is a factor of 3");
                } else {
                    System.out.println("This is not a factor of 3");
                }
            }
            break;
        default:
            System.out.println("The remainder is zero. This is a factor of 9");
        }
    }
    
    /*
     * This is an over commented method. The following comment is garbage
     * 
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * -------------------- comment line --------------------------------------
     * 
     */
    public boolean overCommentedMethod() {
        return true;
    }

}
