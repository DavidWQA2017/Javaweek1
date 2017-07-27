package com.company;

import org.hamcrest.core.IsInstanceOf;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Inventory
{

    ArrayList<Item> allItems;
    ArrayList<Item> availableItems;
    public Inventory()
    {
        this.allItems = new ArrayList<Item>();
        this.availableItems= new ArrayList<Item>();
    }

    public Inventory addItem(Inventory invent)
    {

        Scanner in = new Scanner(System.in);
        String cWord = "";
        System.out.print("enter the id of the item: ");
        int itemID =  Integer.parseInt(in.nextLine().toLowerCase());
        System.out.print("enter if item is available: ");
        Boolean available = Boolean.parseBoolean(in.nextLine().toLowerCase());
        System.out.print("enter how long a person can have the item: ");
        int borrowTenure =  Integer.parseInt(in.nextLine().toLowerCase());
        System.out.print("enter the type of Item: ");
        cWord =  in.nextLine().toLowerCase();

        if (cWord.equals("map")) //move to map class method
        {
            Item newItem = invent.addMap(itemID, available, borrowTenure);
            invent.allItems.add(newItem);
            invent.availableItems.add(newItem);
        }
        else if(cWord.equals("book"))//move to book class method
        {
            Item newItem = invent.addBook(itemID, available, borrowTenure);
            invent.allItems.add(newItem);
            invent.availableItems.add(newItem);
        }
        else if(cWord.equals("media resource") || cWord.equals("mediaresource")) //move to media resource class method
        {
            System.out.print("enter the name of the Object: ");
            String object =  in.nextLine().toLowerCase();

            Item newItem = invent.addMediaResource(itemID, available, borrowTenure);
            invent.allItems.add(newItem);
            invent.availableItems.add(newItem);

        }
        else
        {

        }

        return invent;
    }

    public void removeItem(int id)
    {

    }

    public void updateItem(int id)
    {

    }

    public void displayLibaryContents()
    {

    }

    public Item addMap(int itemID, Boolean available ,int borrowTenure)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the Cartographers name: ");
        String cartogarpher =  in.nextLine().toLowerCase();
        System.out.print("enter the Maps area: ");
        String mapArea =  in.nextLine().toLowerCase();
        Map entry = new Map(itemID, available, borrowTenure, null, null, cartogarpher , mapArea );

        return entry;
    }

    public Item addBook(int itemID, Boolean available ,int borrowTenure )
    {
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy") ;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the title of the book: ");
        String title =  in.nextLine().toLowerCase();
        System.out.print("enter the Author of the book: ");
        String author =  in.nextLine().toLowerCase();
        System.out.print("enter the publish date of the book: ");
        String publishDate = in.nextLine().toLowerCase();
        System.out.print("enter the number of pages in the book: ");
        int numberOfPages =  Integer.parseInt(in.nextLine().toLowerCase());
        try
        {
            Date datePublishDate = format.parse(publishDate);
            Book entry = new Book(itemID, available, borrowTenure, null, null, title, author , datePublishDate , numberOfPages );
            return entry;

           // if (invent.allItems.get(0) instanceof Book) System.out.println(((Book)invent.allItems.get(0)).getNumberOfPages());
            //System.out.println(invent.allItems.get(0).getItemID());
            //System.out.println(invent.availableItems.get(0).getItemID());
        }
        catch (Exception e)
        {
            Book entry = new Book(itemID, available, borrowTenure, null, null, title, author , null, numberOfPages );
            System.out.println("valid date could not be found, could not add item to library");
            return entry;
        }


    }

    public Item addMediaResource(int itemID, Boolean available ,int borrowTenure)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the name of the Object: ");
        String object =  in.nextLine().toLowerCase();
        MediaResources  entry = new MediaResources(itemID, available, borrowTenure, null, null, object);

        return entry;
    }

    /*public int checkItemRecords(int entryValue , String entry , Library lib)
    {
        for(int i = 0; i < invent.size(); i++)
        {
            String currentName = invent.get(i).getitemID();
            if(currentName.equals(entry))
            {
                entryValue = i;
            }

        }
        return entryValue;
    }
    */
}

