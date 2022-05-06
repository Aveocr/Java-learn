package com.example.App.work0;
/*
* @author aveocr
 */
public class StringJava {
    public static void main(String[] arc){
        String s = "hello world";
        System.out.println(s);
        System.out.println("s.length() = " + s.length());

        String format = String.format("Input str = %20s", s);
        System.out.println("format = " + format);

        System.out.println("s.charAt(0) = " + s.charAt(0));

        char chars[] = s.toCharArray();
        for  (char aChar: chars){
            System.out.print(aChar + " ");
        }
        System.out.println();


        String str = "Hello";
        System.out.println("s.compareTo(\"Hello\") = " + s.compareTo(str));

        // toUpperCase - make upper case
        // toLowerCase - make lower case
        // isUpperCase - check case to upper
        // isLowerCase - check case to lower
        // trim - remove all space in string
        // compareTo - compare two string between his
        // replaceAll - work with replace regular
        // replace - just replace target to replacement(replace first find)
        // indexOf - we look for character and return it's index
        // lastIndexOf - look for last character
        // substring(a, b) - print string from a to b. If b is empty then from a
        // isEmpty - check to empty: "" - true, " " - false
        //

    }

}
