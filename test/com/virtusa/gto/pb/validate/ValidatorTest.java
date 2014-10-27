/** 
 * ValidatorTest.java Created by osilva on Oct 6, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.validate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO Class description goes here.
 * @version 
 * @author osilva
 */
public class ValidatorTest {
    
    Validator validator = null;

    /**
     * TODO Method Description as a Single Sentence. 
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        validator = new Validator();
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.validate.Validator#validatePhoneNumber(java.lang.String)}.
     */
    @Test
    public void testValidatePhoneNumber() {
        String notAPhoneNumber = "34 is not a phone number";
        String invalidPhoneNumber = "0987653";
        String validPhoneNumber = "0983456789";
        
        assertFalse(validator.validatePhoneNumber(notAPhoneNumber));
        assertFalse(validator.validatePhoneNumber(invalidPhoneNumber));
        assertTrue(validator.validatePhoneNumber(validPhoneNumber));
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.validate.Validator#validateEntryName(java.lang.String)}.
     */
    @Test
    public void testValidateEntryName() {
        assertFalse(validator.validateEntryName(""));
        assertFalse(validator.validateEntryName("qwertyuiopqwertyuiopqwertyuiop"));
        assertTrue(validator.validateEntryName("Jack Baour"));
    }


    /**
     * Test method for {@link com.virtusa.gto.pb.validate.Validator#copyPasteMethod2(int)}.
     */
    @Test
    public void testCopyPasteMethod2() {
        validator.copyPasteMethod2(1);
        validator.copyPasteMethod2(2);
        validator.copyPasteMethod2(3);
        validator.copyPasteMethod2(4);
    }
    
    @Test
    public void testCopyPasteMethod3() {
        validator.copyPasteMethod3(1);
        validator.copyPasteMethod3(2);
        validator.copyPasteMethod3(3);
       
    }

}
