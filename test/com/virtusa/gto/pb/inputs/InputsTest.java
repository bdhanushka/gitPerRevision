/** 
 * InputsTest.java Created by osilva on Oct 5, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.inputs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TODO Class description goes here.
 * @version 
 * @author osilva
 */
public class InputsTest {

    private String[] inputs = {"Jack Baour", "0433456764","0882345678",
            "No:32, CTE-Avenue, LosAngalies", "jbaour@cte.la.org"};
    
    private Inputs inputsSet = null;
    
    /**
     * TODO Method Description as a Single Sentence. 
     * 
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.inputsSet = new Inputs(inputs);
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#toString()}.
     */
    @Test
    public void testToString() {
        assertNull(this.inputsSet.toString());
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#validateEmailInInputs(java.lang.String)}.
     */
    @Test
    public void testValidateEmailInInputs() {
        assertTrue(this.inputsSet.validateEmailInInputs("abc@cde.com"));
        assertFalse(this.inputsSet.validateEmailInInputs("34abc@efg@egc.com"));
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals("Jack Baour", this.inputsSet.getName());
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#getHomeTpNumber()}.
     */
    @Test
    public void testGetHomeTpNumber() {
        assertEquals("0433456764", this.inputsSet.getHomeTpNumber());
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#getMobileNumber()}.
     */
    @Test
    public void testGetMobileNumber() {
        assertEquals("0882345678", this.inputsSet.getMobileNumber());
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#getAddress()}.
     */
    @Test
    public void testGetAddress() {
        assertEquals("No:32, CTE-Avenue, LosAngalies", 
                this.inputsSet.getAddress());
    }

    /**
     * Test method for {@link com.virtusa.gto.pb.inputs.Inputs#getEmail()}.
     */
    @Test
    public void testGetEmail() {
        assertEquals("jbaour@cte.la.org", this.inputsSet.getEmail());
    }
    
    @Test
    public void testBottle() {
    	Inputs.bottle(1);
    	Inputs.bottle(2);
    	Inputs.bottle(3);
       
    }

}
