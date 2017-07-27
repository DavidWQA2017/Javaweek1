package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 21/07/2017.
 */
public class Library
{
    ArrayList<Inventory> allInventories;
    ArrayList<Person> members;

    public Library()
    {
        this.allInventories = new ArrayList<Inventory>();
        this.members = new ArrayList<Person>();
    }



    public Library addPerson(Library lib)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter your  personal ID ");
        String aPersonalID =  in.nextLine();
        int personalID = Integer.parseInt(aPersonalID);
        System.out.println("please enter your name ");
        String firstName = in.nextLine().toLowerCase();
        System.out.println("please enter your last name ");
        String lastName = in.nextLine();
        System.out.println("please enter the first line of your address ");
        String addressLine1 = in.nextLine();
        System.out.println("please enter postcode ");
        String postcode = in.nextLine();
        System.out.println("please enter your number ");
        String telephoneNumb = in.nextLine();
        System.out.println("thank you, entering you into the system ");

        Person  newMember = new Person(personalID, firstName, lastName, addressLine1, postcode, telephoneNumb, 0);
        lib.members.add(newMember);
        System.out.println("in system " + lib.members.get(0).getFirstName());
        return lib;
    }

    public int checkRecords(int entryValue , String entry , Library lib)
    {
        for(int i = 0; i < lib.members.size(); i++)
        {
            String currentName = lib.members.get(i).getFirstName();
            if(currentName.equals(entry))
            {
                entryValue = i;
            }

        }
        return entryValue;
    }

    public Library removePerson(Library lib)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first name of the person you wish to remove: ");
        String entry = in.nextLine().toLowerCase();
        int entryValue=-1;
        entryValue = lib.checkRecords(entryValue, entry , lib );

        try
        {
            lib.members.remove(entryValue);
        }
        catch(Exception e)
        {
            System.out.println(" person could not be found please enter name of person that exists in the system");
        }

        return lib;

    }

    public void findPerson()
    {}

    public Library updatePerson(Library lib)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first name of the person you wish to edit: ");
        String entry = in.nextLine().toLowerCase();
        int entryValue=-1;
        entryValue = lib.checkRecords(entryValue, entry , lib);
        System.out.println(entryValue);

        System.out.print("please enter first name: ");
        String cInput = in.nextLine().toLowerCase();
        lib.members.get(entryValue).setFirstName(cInput);
        System.out.print("please enter last name: ");
        cInput = in.nextLine().toLowerCase();
        lib.members.get(entryValue).setLastName(cInput);
        System.out.print("please enter first line of address: ");
        cInput = in.nextLine().toLowerCase();
        lib.members.get(entryValue).setAddressLine1(cInput);
        System.out.print("please enter postcode: ");
        cInput = in.nextLine().toLowerCase();
        lib.members.get(entryValue).setPostcode(cInput);
        System.out.print("please enter your number: ");
        cInput = in.nextLine().toLowerCase();
        lib.members.get(entryValue).setTelephoneNumb(cInput);
        System.out.println("thank you, Updating you in the system ");

        return lib;
    }
}
