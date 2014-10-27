package com.virtusa.gto.pb.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.virtusa.gto.pb.inputs.Inputs;

public class PhoneBookTest {

    private PhoneBook phoneBook = null;
    
    @Before
    public void setUp() throws Exception {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testStorePhoneBookEntry() {
        String[] inputs = {"Jack Baour", "0433456764","0882345678",
                "No:32, CTE-Avenue, LosAngalies", "jbaour@cte.la.org"};
        
        Inputs inputsSet = new Inputs(inputs);
        phoneBook.storePhoneBookEntry(inputsSet);
    }

    @Test
    public void testIsAllIntegerCharacters() {
        String allIntString = "324324324";
        String intWithCharsString = "234isfadis23";
        
        assertTrue(phoneBook.isAllIntegerCharacters(allIntString));
        assertFalse(phoneBook.isAllCharacters(intWithCharsString));
    }

    @Test
    public void testIsAllCharacters() {
        String allCharsString = "doafdsufoiuf";
        String allNotCharsString = "dskfj32432sodf";
        
        assertTrue(phoneBook.isAllCharacters(allCharsString));
        assertFalse(phoneBook.isAllCharacters(allNotCharsString));
    }

    @Test
    public void testIsValidEmail() {
        String validEmail = "abc@cde.com";
        String invalidEmail = "34abc@efg@egc.com";
        
        assertTrue(phoneBook.isValidEmail(validEmail));
        assertFalse(phoneBook.isValidEmail(invalidEmail));
    }

}
