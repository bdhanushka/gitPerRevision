/** 
 * PhoneBook.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.PropertyResourceBundle;
import java.util.regex.Pattern;

import com.virtusa.gto.pb.inputs.Inputs;
import com.virtusa.gto.pb.validate.Validator;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class PhoneBook {

    // Static variable that should be final
    public static String settingsFilePath = "config/settings.properties";
    public static int neverReadStaticInt = 234;
    public static String neverReadStaticVariable = "never read value";

    // Unused variable
    private static int test;

    // Member variables
    public String phoneBookFilePath;
    FileInputStream fIn = null;

    public PhoneBook() {
        readProperties();
        settingsFilePath.getBytes();
    }

    public void storePhoneBookEntry(Inputs inputs) {
        Validator validator = new Validator();

        // Validate home phone number
        if (!validator.validatePhoneNumber(inputs.getHomeTpNumber())) {
            System.err.println("Invalid home phone number");
        } else {
            // Validates mobile number
            // Initiates cycle [pre].core -> [pre].validate ->
            if (!validator.validatePhoneNumber(inputs.getMobileNumber())) {
                System.err.println("Invalid mobile number");
            } else {
                // Validates name
                // Initiates cycle [pre].core -> [pre].validate -> [pre].format
                // ->
                if (!validator.validateEntryName(inputs.getName())) {
                    System.err.println("Invalid name");
                } else {
                    // Validates email
                    // Initiates cycle [pre].core -> [pre].validate ->
                    // [pre].inputs -> [pre].format ->
                    if (!validator.validateEmailAddress(inputs)) {
                        System.err.println("Invalid email");
                        System.gc();
                        System.exit(1);
                    } else {

                    }

                }
            }
        }
    }

    private void readProperties() {
        try {
            fIn = new FileInputStream(settingsFilePath);
            PropertyResourceBundle resourceBundile = new PropertyResourceBundle(
                    fIn);

            this.phoneBookFilePath = resourceBundile
                    .getString("phone_book_file_path");
        } catch (Exception e) {
            try {
                fIn.close();
            } catch (Exception ex) {

            }
        }

    }

    /*
     * Cycle Method: Creates a dependency cycle; [let pre = com.virtusa.gto.pb]
     * [pre].core -> [pre].validate ->
     */
    public boolean isAllIntegerCharacters(String inputString) {
        return Pattern.matches("[0-9]+", inputString);
    }

    /*
     * Cycle Method Creates the following cycle; [let pre = com.virtusa.gto.pb]
     * [pre].core -> [pre].validate -> [pre].format ->
     */
    public boolean isAllCharacters(String inputString) {
        String splitSpaces = inputString.replace(" ", "");
        return Pattern.matches("[a-zA-Z]+", splitSpaces);
    }

    /*
     * Cycle Method: Creates the following dependency cycle. [let pre =
     * com.virtusa.gto.pb] [pre].core -> [pre].validate -> [pre].inputs ->
     * [pre].format ->
     */
    public boolean isValidEmail(String email) {
        return Pattern.matches("[a-zA-Z]+\\w*@[\\w+\\.\\w+]+", email);
    }

    private String theNeverReadMethod(String arg1) {
        String messagePrefix = new String("Arg1 is :");
        System.out.println(messagePrefix + arg1);

        if (this.neverReadStaticInt > 0) {
            /* @fixme S1 This is a multi-line review in a  
             * comment block.
             */
            System.out.println("My neverReadStaticInt is "
                    + String.valueOf(this.neverReadStaticInt));
        }
        /* @fixme S1 This is a Severity 1 single-line review in a comment block 
         */

        /* @fixme S2 This is a Severity 2 single-line review in a comment block */
        /* @fixme S3 This is a Severity 3 single-line review in a comment block */
        /* @fixme This is a multi-line review in a comment block without explicit severity (should 
         * default to Severity 1) */

        return "Hello World";
    }

}
