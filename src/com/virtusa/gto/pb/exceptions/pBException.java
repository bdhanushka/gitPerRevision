package com.virtusa.gto.pb.exceptions;

/**
 * 
 * This class has the word "Exception" as the post fix. But it's not inherited
 * from java.lang.Exception
 * 
 * @version
 * @author osilva
 */
public class pBException {

    // member variable starts with a capital letter, and is never read
    private String MemberVariable = "nothing";

    public pBException() {
        System.out.println("pBException instance created");
    }

    public String GetClassName() {
        return this.getClass().toString();
    }

    // Inner class
    class IOException extends java.io.IOException {
        public IOException() {
            super();
        }
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
    
    /*
     * This is a method with CC = 17
     */
    public void complexMethod2(int number) {
        System.out.println("Number : " + String.valueOf(number));
        System.err.println("Dummy error");
        
        if(number == 0) {
            System.out.println("Number is 0");
        } else {
            if (number == 1) {
                System.out.println("Number is 1");
            } else {
                if (number == 2) {
                    System.out.println("Number is 2");
                } else {
                    if (number == 3) {
                        System.out.println("Number is 3");
                    } else {
                        System.out.println("Number is greater than 3");
                    }
                }
            }
        }
        
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
            case 6:
                System.out.println("Case 6");
                break;
            case 7:
                System.out.println("Case 7");
                break;
            default:
                System.out.println("Default Case");
                break;
        }
    }
}
