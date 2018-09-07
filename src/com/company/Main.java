package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    Scanner kbString = new Scanner(System.in);
        System.out.println("Enter your first name: ");
	    String fName = kbString.next();
        System.out.println("Enter your last name");
	    String lName = kbString.next();
        System.out.println("Your full name is: " + fName + " " + lName);


    }
}
