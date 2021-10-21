package org.blz.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.firstNameInput();
        regex.lastNameInput();
        regex.emailInput();
        regex.numberInput();
    }

    public void firstNameInput() {
        String firstNameInput = "Sandeep";
        String regex = "^[[a-z]{1}A-Z]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstNameInput);
        if (matcher.matches()) {
            System.out.println("\n VALID  Name ");
        } else {
            System.out.println("\n invalid Name");
        }
    }

    public void lastNameInput() {

        String lastNameInput = "Varma";
        String regex = "^[[a-z]{1}A-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastNameInput);
        if (matcher.matches()) {
            System.out.println("\n VALID  lastName ");
        } else {
            System.out.println("\n invalid lastName");
        }
    }

    public void emailInput() {
        String emailInput = "abc.xyz@bl.in";
        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailInput);
        if (matcher.matches()) {
            System.out.println("\n VALID  email ID ");
        } else {
            System.out.println("\n invalid  email ID");
        }
    }

    public void numberInput() {
        String numberInput = "91 9919819801";
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numberInput);
        if (matcher.matches()) {
            System.out.println("\n VALID  mobileNumber " );
        } else {
            System.out.println("\n invalid  mobileNumber");
        }
    }
}
