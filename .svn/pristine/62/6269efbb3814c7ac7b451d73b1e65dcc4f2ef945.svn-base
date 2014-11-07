/** 
 * FileReader.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class FileReader {

    FileInputStream fIn;

    public FileReader(String filePath) {
        readBytesFromFile(filePath);
    }

    private void readBytesFromFile(String filePath) {
        try {
            fIn = new FileInputStream(filePath);
            BufferedInputStream buffIn = new BufferedInputStream(fIn);
            byte[] buffer = new byte[1024];
            buffIn.read(buffer);
            fIn.close();
            checkFileInputStreamNullOrNot(fIn);
        } catch (Exception e) {

        }
    }

    private void checkFileInputStreamNullOrNot(FileInputStream fIn) {
        fIn = null;
        if (fIn == null) {
            System.out.println("FileInputStream is Null");
        } else {
            System.out.println("FileInputStream is not Null");
        }
    }

    public void createFileInputStreamForFun(String filePath) {
        try {
            FileInputStream fIn = new FileInputStream(new File(filePath));
        } catch (Exception e) {
        }
    }

    public void dangerousMethod() {
        System.runFinalizersOnExit(true);
    }
    
    public void copyPasteMethod2(int number) {
        System.out.println("Number : " + String.valueOf(number));
        System.err.println("Dummy error");
        
        switch (number) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default Case");
                break;
        }
    }
    
    public void watebottle01(){
    	System.out.println();
    }
    
    
}
