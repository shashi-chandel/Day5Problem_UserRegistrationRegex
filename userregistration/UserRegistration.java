package com.capgemini.userregistration;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, last;
		System.out.println("Enter your first name: ");
		first = sc.nextLine();
		String namePattern = "[A-Z]{1}[a-zA-Z]{2,}";
		do {
			System.out.println("Enter your first name: ");
			first = sc.nextLine();
		} while (!Pattern.matches(namePattern, first));

		System.out.println("\nEnter your last name: ");
		last = sc.nextLine();
		if (Pattern.matches(namePattern, last)) {
			System.out.println("Valid last name");
		} else {
			System.out.println("Invalid last name!!");
			do {
				System.out.println("Enter your last name: ");
				last = sc.nextLine();
			} while (!Pattern.matches(namePattern, last));
			System.out.println("Valid  last name");
			System.out.println("\nUser name is " + first + " " + last);
			sc.close();
		}
	}
}
