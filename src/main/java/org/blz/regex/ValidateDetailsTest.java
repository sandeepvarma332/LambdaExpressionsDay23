package org.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDetailsTest {

    public static String regex;

    public static boolean name(String name) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean mail(String mailID) {
        regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailID);
        return matcher.matches();
    }

    public static boolean phonenumber(String phonenumber) {
        regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phonenumber);
        return matcher.matches();
    }

    public static boolean password(String password) {
        regex = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}