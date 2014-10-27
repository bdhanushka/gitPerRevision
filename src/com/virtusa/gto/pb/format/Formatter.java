/** 
 * Formatter.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.format;

import java.util.Random;

import com.virtusa.gto.pb.core.PhoneBook;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class Formatter {

    public Formatter() {
        // Default constructor
    }

    /*
     * Cycle Method Creates the following cycle; [let pre = com.virtusa.gto.pb]
     * [pre].core -> [pre].validate -> [pre].format ->
     */
    public String formatName(String entryName) {
        PhoneBook pb = new PhoneBook();

        if (pb.isAllCharacters(entryName)) {
            String[] nameParts = entryName.split(" ");
            StringBuffer formattedNamesBuffer = new StringBuffer();

            for (String namePart : nameParts) {
                formattedNamesBuffer.append(Character.toString(Character
                        .toUpperCase(namePart.charAt(0)))
                        + namePart.substring(1) + " ");
            }

            return formattedNamesBuffer.toString().trim();
        } else {
            return "";
        }
    }

    /*
     * Cycle Method: Creates the following dependency cycle. [let pre =
     * com.virtusa.gto.pb] [pre].core -> [pre].validate -> [pre].inputs ->
     * [pre].format ->
     */
    public boolean validateEmailInFormatter(String emailString) {
        PhoneBook pb = new PhoneBook();
        return pb.isValidEmail(emailString);
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
