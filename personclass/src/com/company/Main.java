package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>(3);
        //original way
        Person me = new Person("Jack", 22, "Consultant");
        people.add(me);
        Person one = new Person("Bob", 25, "clerk");
        people.add(one);
        Person two = new Person("Geoff", 90, "Assistant");
        people.add(one);

        //neater way
        people.add(new Person("Jack", 22, "Consultant"));
        people.add(new Person("Bob", 25, "clerk"));
        people.add(new Person("Bob", 25, "clerk"));

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Name " + people.get(i).getName());
            System.out.println("Age " + people.get(i).getAge());
            System.out.println("Job " + people.get(i).getJob());
        }
    }
}

class Person
{
    private String name;
    private int  age;
    private String job;

    public Person (String name, int age, String job)
    {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge()
    {

        return age;
    }

    public String getJob()
    {
        return job;
    }

    public String getName() {
        return name;
    }
}

class Vehicle
{

}