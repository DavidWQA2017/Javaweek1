package com.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> task1Exercise(ArrayList<String> task1)
    {

        for(int i = 0; i < task1.size(); i++ )
        {
            String completeWord = "";
            char[] cString = task1.get(i).toCharArray();
            for (int j=0; j <  cString.length; j++ )
            {
                for (int k = 0; k < 2; k++)
                {
                    completeWord = completeWord + cString[j];
                    System.out.println(cString[j]);
                }
            }
            task1.set(i ,completeWord);
        }

        return task1;
    }

    public static void task2Exercise()
    {
        ArrayList<String> wordList = new ArrayList<>();
        String cWord = "xxbreadjambreadyy";
        String[] words = new String[3];
        int breadCounter = 0;
        words = cWord.split("bread");
        for (int i = 0; i < words.length; i++)
        {
            wordList.add(words[i]);
        }
        if (wordList.size() > 0)
        {

            System.out.println(wordList);
        }
        else
        {
            System.out.println("");
        }


    }

    public static void task3Exercise()
    {
        int a = 2, b= 4 , c= 6;

        int small = c;
        int medium = c;
        int large = c;
        int [] allnumbers = {a,b ,c};



        for (int j =0; j < 2; j++)
        {
            for(int i = 0; i < 3; i ++)
            {
                if (allnumbers[i] > large )
                {
                    large = allnumbers[i];
                }
                else if (allnumbers[i] < small)
                {
                    small = allnumbers[i];
                }
                else if (allnumbers[i] < large && allnumbers[i] > small )
                {
                    medium = allnumbers[i];
                }
            }
        }


        System.out.println("large " + large);
        System.out.println("small " + small);
        System.out.println("medium " + medium);

        //compare the difference between medium and small and medium and large and if tehre the same print true etc.

    }

    public static void main(String[] args)
    {
        // task 1 information
	    ArrayList<String>  task1 = new ArrayList<>();
        task1.add("The");
        task1.add("AAbb");
        task1.add("Hi-There");
        task1 = task1Exercise(task1);
        System.out.println(task1);
        // task 2 information
        task2Exercise();
        //task 3 information
        task3Exercise();
    }
}
