/** 
 * Validator.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.validate;

import java.io.FileInputStream;
import java.util.regex.Pattern;

import com.virtusa.gto.pb.core.PhoneBook;
import com.virtusa.gto.pb.format.Formatter;
import com.virtusa.gto.pb.inputs.Inputs;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class Validator {

    public Validator() {
        // Default constructor
    }

    /*
     * Cycle Method: Creates a dependency cycle; [let pre = com.virtusa.gto.pb]
     * [pre].core -> [pre].validate ->
     */
    public boolean validatePhoneNumber(String phoneNumber) {
        String neverReadLocalVariable = phoneNumber;

        boolean isValidLength, isValidContent;
        PhoneBook pb = null;

        try {
            pb = new PhoneBook();

            // Writes to a static filed which is incorrect
            pb.settingsFilePath = "some other value";
            pb.neverReadStaticVariable = "some other value";

            isValidLength = phoneNumber.length() != 10 ? false : true;
            isValidContent = pb.isAllIntegerCharacters(phoneNumber);
            return (isValidContent && isValidLength);
        } catch (Exception e) {
            pb.phoneBookFilePath.compareTo(null);
            return false;
        }

    }

    /*
     * Cycle Method Creates the following cycle; [let pre = com.virtusa.gto.pb]
     * [pre].core -> [pre].validate -> [pre].format ->
     */
    /**
     * 
     * Validates the entry name.
     * 
     * Checks if the formatted name is empty or has more characters than
     * expected
     * 
     * @param entryName
     *            The name needed to be validated
     * @return true if valid and false otherwise
     */
    public boolean validateEntryName(String entryName) {
        Formatter formatter = new Formatter();
        String formattedName = formatter.formatName(entryName);

        if (formattedName != "" && formattedName.length() < 20) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Cycle Method: Creates the following dependency cycle. [let pre =
     * com.virtusa.gto.pb] [pre].core -> [pre].validate -> [pre].inputs ->
     * [pre].format ->
     */
    public boolean validateEmailAddress(Inputs inputs) {
        return inputs.validateEmailInInputs(inputs.getEmail());
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
    
    public void copyPasteMethod3(int number) {
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
}
