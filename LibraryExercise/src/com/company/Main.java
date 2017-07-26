package com.company;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;
import static sun.misc.Version.print;

public class Main {

    public static void main(String[] args)
    {

        Library lib = new Library();
        Inventory invent = new Inventory();
        Scanner in = new Scanner(System.in);

        System.out.println(" What would you like to do in the Library ");
        System.out.println("enter 1 for Member functions ");
        System.out.println("enter 2 for Item functions");
        String optionString =  in.nextLine();
        int optionInt =  Integer.parseInt(optionString);

        if(optionInt == 1)
        {

            System.out.println(" please pick option to access a function ");
            System.out.println("enter 1 for adding new member");
            System.out.println("enter 2 for deleting existing member ");
            System.out.println("enter 3 for changing existing members details ");
            optionString =  in.nextLine();
            optionInt =  Integer.parseInt(optionString);

            if (optionInt == 1)
            {
                lib = lib.addPerson(lib);
            }
            else if(optionInt == 2)
            {
                Person  newMember = new Person(1, "bob", "smith", "22 Newport road", "CF2 9LP", "07789654733", 1);
                lib.members.add(newMember);
                lib = lib.removePerson(lib);
            }
        }
        else if(optionInt == 2)
        {

        }
        else{}


        /*
        Scanner in = new Scanner(System.in);
        String Stuff = "";
        Stuff = in.nextLine();
        */




        System.out.println(lib.members.get(0).getFirstName());
        lib.members.get(0).setFirstName("Jim".toLowerCase());
        System.out.println(lib.members.get(0).getFirstName());

        //System.out.println(Stuff);

    }
}
