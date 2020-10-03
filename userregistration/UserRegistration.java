package com.capgemini.userregistration;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your First Name:");
				String first = sc.nextLine();
				String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";
				if(Pattern.matches(namePattern, first))
	        	     System.out.println("Valid first name");
	               else 
	        	     System.out.println("Invalid entry!!");
				}
}
