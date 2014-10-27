package com.virtusa.gto.pb.format;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FormatterTest {

    private Formatter formatter = null;
    
    @Before
    public void setUp() throws Exception {
        this.formatter = new Formatter();
    }

    @Test
    public void testFormatName() {
        String validName = "jack baour";
        String invalidName = "ja4ck baour";
        
        assertEquals("Jack Baour", this.formatter.formatName(validName));
        assertEquals("", this.formatter.formatName(invalidName));
    }

    @Test
    public void testValidateEmailInFormatter() {
        String validEmail = "abc@cde.com";
        String invalidEmail = "34abc@efg@egc.com";
        
        assertTrue(this.formatter.validateEmailInFormatter(validEmail));
        assertFalse(this.formatter.validateEmailInFormatter(invalidEmail));
    }
    
    @Test
    public void testCopyPasteMethod1() {
        this.formatter.copyPasteMethod1();
    }

}
