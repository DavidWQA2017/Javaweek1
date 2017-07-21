package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args)
    {
        String filename = "PersonInfo.txt";

        ArrayList<Person> allPeople = new ArrayList<>();
        Person person1 =  new Person("Bill" , 25 , "Mechanic" );
        allPeople.add(person1);
        Person person2 =  new Person("Steve" , 32 , "Manager" );
        allPeople.add(person2);
        Person person3 =  new Person("Harry" , 21 , "Receptionist" );
        allPeople.add(person3);
        Person person4 =  new Person("Paul" , 22 , "Technician" );
        allPeople.add(person4);
        Person person5 =  new Person("Jake" , 28 , "Consultant" );
        allPeople.add(person5);


        for (int i =0; i < allPeople.size(); i++)
        {
            System.out.println(" entries names " + allPeople.get(i).getName());
        }

        allPeople.get(0).writeToFile(allPeople);

        ArrayList<Person> allPeopleFromFile = allPeople.get(0).readFromFile(filename);
        System.out.println("\n");

        for (int i =0; i < allPeopleFromFile.size(); i++)
        {
            System.out.println(allPeopleFromFile.get(i).getName() + " is " + allPeopleFromFile.get(i).getAge() + " and works as a " + allPeopleFromFile.get(i).getOccupation());
        }





    }
}

class Person
{
    private final String FILENAME = "PersonInfo.txt";
    private BufferedReader  br;
    private String name;
    private String occupation;
    private int age;


   Person(String name, int age, String occupation)
    {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOccupation()
    {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void writeToFile(ArrayList<Person> allPeople)
    {
        try
        {
            PrintWriter  writer= new PrintWriter(FILENAME , "UTF-8");

            for(int i =0; i < allPeople.size(); i++)
            {
                writer.println(allPeople.get(i).getName() + "," +  allPeople.get(i).getAge() + "," + allPeople.get(i).getOccupation() );
            }

            writer.close();


        }
        catch (IOException e)
        {

        }
    }

    public ArrayList<Person> readFromFile(String filename)
    {
        ArrayList<Person> allPeople = new ArrayList<>();
        String[] fromFile = new String[3];



        try
        {
            String currentLine;

            br = new BufferedReader(new FileReader(filename));


                while ((currentLine = br.readLine()) != null)
                {
                    fromFile = currentLine.split(",");
                    //System.out.print();
                    allPeople.add(new Person(fromFile[0], Integer.parseInt(fromFile[1]), fromFile[2]));
                }




        }
        catch (IOException e)
        {

        }

        return allPeople;
    }


}