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
        regex.passwordInput1();
        regex.passwordInput2();
        regex.passwordInput3();
        regex.passwordInput4();
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

    public void passwordInput1() {
        String passwordInput1 = "SandeepVarma";
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput1);
        if (matcher.matches()) {
            System.out.println("\n VALID  rule 1 passed " );
        } else {
            System.out.println("\n invalid rule 1  not passed ");
        }
    }

    public void passwordInput2() {
        String passwordInput2 = "SandeepVarma";
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput2);
        if (matcher.matches()) {
            System.out.println("\n VALID  rule 2 passed " );
        } else {
            System.out.println("\n invalid rule 2  not passed ");
        }
    }

    public void passwordInput3() {
        String passwordInput3 = "SandeepVarma99";
        String regex = "^[a-zA-Z]{8,}[0-9]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput3);
        if (matcher.matches()) {
            System.out.println("\n VALID  rule 3 passed " );
        } else {
            System.out.println("\n invalid rule 3  not passed ");
        }
    }

    public void passwordInput4() {
        String passwordInput4 = "SandeepVarma99@";
        String regex = "^[a-zA-Z]{8,}[0-9]{2,}[@-_]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput4);
        if (matcher.matches()) {
            System.out.println("\n VALID  rule 4 passed " );
        } else {
            System.out.println("\n invalid rule 4  not passed ");
        }
    }
}

