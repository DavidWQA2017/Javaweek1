package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
	        String string1 = "sad";
            String string2 = "say";
            char[] string1Char = string1.toCharArray();
            char[] string2Char = string2.toCharArray();

            ArrayList<String> allSubStrings = new ArrayList<>();
        for (int j = 0; j < string1Char.length; j++  )
        {
            for (int i = 0; i < string1Char.length; i++)
            {
                if (string1Char[i] == string2Char[i])
                {
                    allSubStrings.add(String.valueOf(string1Char[i]));
                }
            }
        }
        System.out.println(allSubStrings);


        //System.out.println(string1.substring(0, 1));
        //System.out.println(string1.substring(0, 2));
        //System.out.println(string1.substring(1, 2));
        //System.out.println(string1.substring(1, 3));
        //System.out.println(string1.substring(2, 3));





    }
}
