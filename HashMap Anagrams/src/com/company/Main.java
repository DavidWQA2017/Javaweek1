package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main
{
    public static ArrayList<String> loadFromFile() throws IOException
    {
        ArrayList<String> anagramList = new ArrayList<>();
        BufferedReader br = null;
        try {
            String filename = "Anagram.txt";

            String currentLine;

            br = new BufferedReader(new FileReader(filename));

            while ((currentLine = br.readLine()) != null) {

                anagramList.add(currentLine);
                //currentLine // do something
            }
            return anagramList;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally {
            try
            {
                br.close();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public static ArrayList<String> sortLetters(ArrayList<String> anagramList)
    {
        char[] unSorted;
        char[] word = "abc".toCharArray();

        ArrayList<String> anagramsPerWord = new ArrayList<>();
        HashMap<String, ArrayList<String>> mostAnagrams = new HashMap<>();
        //create anagram lists for each word in file
        for(int j = 0; j < anagramList.size(); j++)
        {
            word = anagramList.get(j).toCharArray();
            anagramsPerWord= new ArrayList<>();
            // sort and add anagrams to appropriate lists
            for (int i = 0; i < anagramList.size(); i++) {
                Arrays.sort(unSorted = anagramList.get(i).toLowerCase().toCharArray());
                anagramList.set(i, new String(unSorted));


                if (Arrays.equals(unSorted, word))
                {
                    anagramsPerWord.add(anagramList.get(i));
                    mostAnagrams.put(new String(word), anagramsPerWord);
                }
                //map anagrams to hash map
                mostAnagrams.put(new String(word), anagramsPerWord);

            }
            System.out.println(" how many items in list is " + anagramsPerWord);
            //mostAnagrams.put(new String(word), anagramsPerWord);
        }

        int maxAnagrams = mostAnagrams.get("adfhj").size();
        System.out.println(maxAnagrams);
        String currentWord = "not working";

        //look at all lists and find the key which applies to the biggest list
        for (Map.Entry<String, ArrayList<String>> entry : mostAnagrams.entrySet())
        {
            System.out.println(currentWord + " in loop " );
            if (maxAnagrams < entry.getValue().size())
            {
                System.out.println(currentWord + " in second  loop ");
                maxAnagrams = entry.getValue().size();
                currentWord = entry.getKey();
            }
            else
            {

            }
        }
        System.out.println(currentWord);


        return anagramsPerWord;
    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> anagramList = new ArrayList<>();

        anagramList = loadFromFile();
        System.out.println(anagramList.get(0));
        sortLetters(anagramList);
        //anagramList = sortLetters(anagramList);
        //System.out.println(anagramList.get(0));
    }
}



