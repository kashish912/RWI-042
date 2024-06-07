package com;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 String str = "Kashish";
	        String res = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (res.indexOf(ch) == -1) {
	                res =res+ch;
	            }
	        }

	        System.out.println("Original string: " + str);
	        System.out.println("String after removing duplicates: " + res);

	}

}
