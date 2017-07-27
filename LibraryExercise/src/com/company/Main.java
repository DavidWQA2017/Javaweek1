package com.company;

import java.io.IOException;
import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import static sun.misc.Version.print;

public class Main {

    public static void main(String[] args)
    {
        DateFormat format = new SimpleDateFormat("d/m/yyyy") ;
        Library lib = new Library();
        Inventory invent = new Inventory();
        Scanner in = new Scanner(System.in);

        System.out.println("What would you like to do in the Library ");
        System.out.println("enter 1 for Member functions ");
        System.out.println("enter 2 for Item functions");
        String optionString =  in.nextLine();
        int optionInt =  Integer.parseInt(optionString);

        if(optionInt == 1)
        {

            System.out.println("please pick option to access a function ");
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
                Person  newMember = new Person(1, "bob".toLowerCase(), "smith", "22 Newport road", "CF2 9LP", "07789654733", 1);
                lib.members.add(newMember);
                lib = lib.removePerson(lib);
            }
            else if (optionInt == 3)
            {
                Person  newMember = new Person(1, "bob".toLowerCase(), "smith", "22 Newport road", "2CF2 9LP", "07789654733", 1);
                lib.members.add(newMember);
                lib = lib.updatePerson(lib);

                System.out.println(lib.members.get(0).getFirstName());
            }
            else {}
        }
        else if(optionInt == 2)
        {
            System.out.println("please pick option to access a function ");
            System.out.println("enter 1 for adding new item into library ");
            System.out.println("enter 2 for removing item from library ");
            System.out.println("enter 3 for checking item into library ");
            System.out.println("enter 4 for returning item to library ");

            optionString =  in.nextLine();
            optionInt =  Integer.parseInt(optionString);



            if (optionInt == 1)// move to method in item
            {
                invent.addItem(invent);
                if (invent.allItems.get(0) instanceof Book) System.out.println(((Book)invent.allItems.get(0)).getPublishedDate());
            }
            if (optionInt == 2)
            {

            }
            if (optionInt == 3)
            {

            }
            if (optionInt == 4)
            {

            }
            else{}
        }
        else{}


        /*
        Scanner in = new Scanner(System.in);
        String Stuff = "";
        Stuff = in.nextLine();
        */


        //System.out.println(lib.members.get(0).getFirstName());
        //lib.members.get(0).setFirstName("Jim".toLowerCase());1
        //System.out.println(lib.members.get(0).getFirstName());

        //System.out.println(Stuff);

    }
}
