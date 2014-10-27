package com.virtusa.gto.pb.defect;

public class Violation {
	
	public void violation(){}
	
	 public void error(int number) {
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
