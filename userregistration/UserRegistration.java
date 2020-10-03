package com.capgemini.userregistration;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, last;
		String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";
		do {
			System.out.println("Enter your first name: ");
			first = sc.nextLine();
			if (Pattern.matches(namePattern, first))
				System.out.println("Valid first name");
			else
				System.out.println("Invalid first name!!");
		} while (!Pattern.matches(namePattern, first));

		do {
			System.out.println("\nEnter your last name: ");
		last = sc.nextLine();
		if (Pattern.matches(namePattern, last)) {
			System.out.println("Valid last name");
		} else {
			System.out.println("Invalid last name!!");
			}
		}while (!Pattern.matches(namePattern, last));
			System.out.println("\nUser name is " + first + " " + last);
			
		String email;
		String emailPattern = "^[a-z]+[+-.]{0,1}[a-z0-9]+@[a-z0-9]+[.]{1}[a-z]{2,}([.]{0,1}[a-z]{2,}){0,1}([,]){0,1}$";
		do {
			System.out.println("\nEnter your email id: ");
			email = sc.nextLine();
			if(Pattern.matches(emailPattern, email))
				System.out.println("Valid email Id!");
			else
				System.out.println("Invalid email!!");
		} while (!Pattern.matches(emailPattern, email));
		System.out.println("\nUser email id is " + email);
	}
}
