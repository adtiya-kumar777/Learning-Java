package com.company;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aditya";
        System.out.println(name);

        //Print the length of the string
        int value = name.length();
        System.out.println(value);

        // Change the String into lowerCase
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        // Change the String into upperCase
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        // Trim the String (avoid trailing Spaces in the String)
        String trimmedString = "     Developer     ";
        System.out.println(trimmedString);
        System.out.println(trimmedString.trim());

        //subString
        System.out.println(name.substring(2,4));

        //replace the character in the string
        String newString = "Harry";
        System.out.println(newString.replace('r', 'p'));

        //checking if string starts & ends  with that particular character or not
        System.out.println(name.startsWith("Ad"));
        System.out.println(name.endsWith("yaa"));

        //return the charAt particular position
        System.out.println(name.charAt(3));

        //return the indexOf String
        String modifiedString = "Harryrry";
        System.out.println(modifiedString.indexOf("rry"));
        System.out.println(modifiedString.indexOf("rry", 4));
        System.out.println(modifiedString.lastIndexOf("rry", 4));

        //Check wheather String is equal or not
        System.out.println(name.equals("aditya"));
        System.out.println(name.equalsIgnoreCase("aditya"));
    }
}
