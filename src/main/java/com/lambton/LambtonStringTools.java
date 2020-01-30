/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lambton;
import java.util.regex.Pattern;
/**
 *
 * @author Pritesh Patel
 */

public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(s);
        String rev = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                rev = temp[i] + rev;
            else
                rev = " " + temp[i] + rev;
        }
        return rev;
    }

    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
        {
            if (s.length() == 0)
            { System.out.println("NULL");}


        }

    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s)
    {
        return null;
    }

    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s)
    {
       return 0;
    }

    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString)
    {
        return null;
    }
}
