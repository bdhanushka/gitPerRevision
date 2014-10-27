/** 
 * Inputs.java Created by osilva on Sep 17, 2008.
 * 
 * Copyright (c) 2008 Virtusa Corporation. All Rights Reserved.<br><br>. 
 * 
 */
package com.virtusa.gto.pb.inputs;

import com.virtusa.gto.pb.format.Formatter;

/**
 * TODO Class description goes here.
 * 
 * @version
 * @author osilva
 */
public class Inputs {

    private String name;
    private String homeTpNumber;
    private String mobileNumber;
    private String address;
    private String email;

    public Inputs(String args[]) {
        this.name = args[0];
        this.homeTpNumber = args[1];
        this.mobileNumber = args[2];
        this.address = args[3];
        this.email = args[4];
    }

    @Override
    public String toString() {
        return null;
    }

    /*
     * Cycle Method: Creates the following dependency cycle. [let pre =
     * com.virtusa.gto.pb] [pre].core -> [pre].validate -> [pre].inputs ->
     * [pre].format ->
     */
    public boolean validateEmailInInputs(String emailString) {
        Formatter formatter = new Formatter();
        return formatter.validateEmailInFormatter(emailString);
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @return the homeTpNumber
     */
    public final String getHomeTpNumber() {
        return homeTpNumber;
    }

    /**
     * @return the mobileNumber
     */
    public final String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @return the address
     */
    public final String getAddress() {
        return address;
    }

    /**
     * @return the email
     */
    public final String getEmail() {
        return email;
    }
    
    public static void bottle(int number) {
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
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            default:
                System.out.println("Default Case");
                break;
        }
    }
}
