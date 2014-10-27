package com.virtusa.gto.pb.io;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class FileWriterTest {
    
    FileWriter fileWriter = null;

    @Before
    public void setUp() throws Exception {
        File zipFile = new File("config/test.zip");
        if(zipFile.exists()) {
            zipFile.delete();
        }
        
        fileWriter = new FileWriter();
    }

    @Test
    public void testWriteZipFile() {
        FileWriter newFileWriter = new FileWriter("config/test.zip");
        newFileWriter.writeZipFile("config/test.zip");
    }

    @Test
    public void testComplexMethod() {
        fileWriter.complexMethod(1);
        fileWriter.complexMethod(2);
        fileWriter.complexMethod(3);
        fileWriter.complexMethod(4);
        fileWriter.complexMethod(5);
        fileWriter.complexMethod(6);
        fileWriter.complexMethod(7);
        fileWriter.complexMethod(8);
        fileWriter.complexMethod(9);
        
        fileWriter.complexMethod(13);
        fileWriter.complexMethod(16);
        fileWriter.complexMethod(25);
        fileWriter.complexMethod(26);
    }

    @Test
    public void testOverCommentedMethod() {
        assertTrue(fileWriter.overCommentedMethod());
    }

}
