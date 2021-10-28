package org.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Lambda_function {
    boolean check_regex(String regex, String input);
}

class Lambda_validate {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_ID, phone_number, password;


    public static void main(String[] args) {
        Lambda_function validate = (regex, input) -> {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        };
        Lambda_validate details = new Lambda_validate();

        String first_name_regex = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("\nEnter the first name with first letter capital and name should be minimum 3 letters:");
        first_name = scan.nextLine();
        if (validate.check_regex(first_name_regex, first_name)) {
            System.out.println("\nYour name " + first_name + " is in correct format.");
        } else {
            System.out.println("\nFirst name is not in format...");
        }

        String last_name_regex = "^[A-Z]{1}[a-z]{2,}$";
        System.out.println("\nEnter the last name with first letter capital and name should be minimum 3 letters:");
        last_name = scan.nextLine();
        if (validate.check_regex(last_name_regex, last_name)) {
            System.out.println("\nYour name " + last_name + " is in correct format.");
        } else {
            System.out.println("\nLast name is not in format...");
        }

        String mail_regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        System.out.println("\nEnter the mail with following valid format:");
        System.out.println("\nFormat is E.g. abc.xyz@bl.co.in (In that abc, bl & co is mandatory)");
        mail_ID = scan.nextLine();
        if (validate.check_regex(mail_regex, mail_ID)) {
            System.out.println("\nYour name " + mail_ID + " is in correct format.");
        } else {
            System.out.println("\nMail is not in format...");
        }


        String password_regex = "^(?=.*[!@#$%^&*+=])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
        System.out.println("\nEnter the password with following rules");
        System.out.println("1. minimum 8 characters\n2.At Least one uppercase\n3.At Least one numerical\n4.At Least one special character");
        password = scan.nextLine();
        if (validate.check_regex(password_regex, password)) {
            System.out.println("\nYour name " + password + " is in correct format.");
        } else {
            System.out.println("\nPassword is not in format...");
        }

        String number_regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        System.out.println("\nEnter the phone number with country code and leave gap between them (E.g:91 9876543210):");
        phone_number = scan.nextLine();
        if (validate.check_regex(number_regex, phone_number)) {
            System.out.println("\nYour name " + phone_number + " is in correct format.");
        } else {
            System.out.println("\nPhone number is not in format...");
        }
    }

}